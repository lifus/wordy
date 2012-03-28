import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.AttributeRenderer;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

public class Tool {

	public static boolean hasError = false;
	private String fileName;
	private String jasminFileName;
	private boolean debug;

	public static class CountingLexer extends WordyLexer {
		List<String> l = new ArrayList<String>();

		public CountingLexer(CharStream lexer) {
			super(lexer);
		}

		public Token nextToken() {
			startPos = getCharPositionInLine();
			return super.nextToken();
		}
	}

	public static void main(String[] args) throws Exception {
		Tool tool = new Tool();
		if (args.length == 0 || "-help".equals(args[0])) {
			System.out.print("usage:java -jar wordy.jar [-debug] <file>\n"
					+ "help:java -jar wordy.jar -help");
			return;
		} else if (args.length == 1) {
			tool.debug = false;
			tool.process(args[0]);
		} else if (args.length == 2 && args[0].equals("-debug")) {
			tool.debug = true;
			tool.process(args[1]);
		}
	}

	private void process(String fileName) throws IOException {
		this.fileName = fileName;
		hasError = false;
		try {
			CharStream input = new ANTLRFileStream(fileName);
			WordyLexer lexer = new CountingLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			WordyTokenSource indentedSource = new WordyTokenSource(tokens);
			tokens = new CommonTokenStream(indentedSource);

			WordyParser parser = new WordyParser(tokens);
			WordyParser.program_return r = parser.program();
			CommonTree t = (CommonTree) r.getTree();
			if (debug) {
				System.out.println(t.toStringTree());
			}
			if (!parser.hasError && t != null) {
				CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
				WordySemantic semantic = new WordySemantic(nodes);
				nodes.setTokenStream(tokens);
				semantic.program(parser.functions);

				if (!hasError) {
					nodes.reset();
					gencode(nodes, parser.functions, parser.globals);
				}

			}
		} catch (RecognitionException e) {
			e.printStackTrace(System.err);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected StringTemplate gencode(CommonTreeNodeStream nodes,
			FunctionsTable functions, Globals globals)
			throws RecognitionException, IOException, InterruptedException {
		WordyWalker gen = new WordyWalker(nodes);
		StringTemplateGroup templates = getTemplates();
		// templates.emitDebugStartStopStrings(dbgST);
		gen.setTemplateLib(templates);
		WordyWalker.program_return ret = gen.program(functions, globals);
		StringTemplate st = (StringTemplate) ret.getTemplate();

		generateJasmin(st);
		generateJar();
		if (debug) {
			System.out.println(st.toString());
		}
		return st;
	}

	private void generateJasmin(StringTemplate st) {
		jasminFileName = fileName + ".j";
		File jasminFile = writeFile(".", jasminFileName, st.toString());
		String[] arguments = { jasminFileName };
		jasmin.Main.main(arguments);
		jasminFile.delete();
	}

	public void generateJar() throws IOException {
		String jarFileName = fileName + ".jar";
		Manifest manifest = new Manifest();
		manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION,
				"1.0");
		manifest.getMainAttributes().put(Attributes.Name.MAIN_CLASS, "Wrapper");
		JarOutputStream target = new JarOutputStream(new FileOutputStream(
				jarFileName), manifest);
		File dotClassFile = new File("Wrapper.class");
		addFileToJar(dotClassFile, target);
		dotClassFile.delete();
		target.close();
	}

	private void addFileToJar(File source, JarOutputStream target)
			throws IOException {
		BufferedInputStream in = null;
		try {
			if (source.isDirectory()) {
				String name = source.getPath().replace("\\", "/");
				if (!name.isEmpty()) {
					if (!name.endsWith("/"))
						name += "/";
					JarEntry entry = new JarEntry(name);
					entry.setTime(source.lastModified());
					target.putNextEntry(entry);
					target.closeEntry();
				}
				for (File nestedFile : source.listFiles())
					addFileToJar(nestedFile, target);
				return;
			}

			JarEntry entry = new JarEntry(source.getPath().replace("\\", "/"));
			entry.setTime(source.lastModified());
			target.putNextEntry(entry);
			in = new BufferedInputStream(new FileInputStream(source));

			byte[] buffer = new byte[1024];
			while (true) {
				int count = in.read(buffer);
				if (count == -1)
					break;
				target.write(buffer, 0, count);
			}
			target.closeEntry();
		} finally {
			if (in != null)
				in.close();
		}
	}

	private StringTemplateGroup getTemplates() {
		StringTemplateGroup templates = null;
		try {
			ClassLoader cl = Thread.currentThread().getContextClassLoader();
			InputStream is = cl.getResourceAsStream("templates/Bytecode.stg");
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			templates = new StringTemplateGroup(br,
					AngleBracketTemplateLexer.class);
			templates.registerRenderer(String.class, new AttributeRenderer() {
				public String toString(Object o) {
					return (String) o;
				}

				public String toString(Object o, String formatString) {
					if (formatString.equals("capital")) {
						String s = ((String) o);
						return Character.toUpperCase(s.charAt(0))
								+ s.substring(1, s.length());
					}
					return toString(o);
				}
			});

			br.close();
		} catch (IOException ioe) {
			error("cannot loadType templates", ioe);
		}
		return templates;
	}

	public String getErrorHeader(RecognitionException e) {
		return "line " + e.line + ":" + e.charPositionInLine;
	}

	public static void error(BaseRecognizer recog, String msg, CommonTree node) {
		hasError = true;
		String linecol = ":";
		if (node != null) {
			CommonToken t = (CommonToken) node.getToken();
			linecol = "line " + t.getLine();
		}
		String filename = getInputStreamName(recog);
		System.err.println(filename + ": " + linecol + " " + msg);
		System.err.flush();
	}

	public static String getInputStreamName(BaseRecognizer recog) {
		String filename = "<stdin>";
		if (recog == null) {
			filename = "wordy";
		} else {
			filename = recog.getSourceName();
		}
		return filename;
	}

	protected File writeFile(String outputDir, String outputFileName,
			String data) {
		FileWriter fw = null;
		File f = null;
		try {
			f = new File(outputDir, outputFileName);
			fw = new FileWriter(f);
			fw.write(data);
		} catch (IOException ioe) {
			error("can't write " + outputFileName, ioe);
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException ioe2) {
				error("can't close " + outputFileName, ioe2);
			}
		}
		return f;
	}

	public static void error(BaseRecognizer recog, String msg) {
		error(recog, msg, (CommonTree) null);
	}

	public static void error(String msg) {
		error(null, msg, (CommonTree) null);
	}

	public static void error(String msg, Exception e) {
		error(msg);
		e.printStackTrace(System.err);
	}
}
