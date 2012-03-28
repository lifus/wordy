import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Function {
		private String idtf;
		private String returnType;
		private int lineBeginning;
		private ArrayList<Integer> callLines = new ArrayList<Integer>();
		private List<String> parameterTypes = new LinkedList<String>();
		private VariableScope variables = new VariableScope();
		private int currentVarNumber = 1;
		private int cachedVarNumber = 1;
		private int currentOpNumber = 1;

		public Function(String returnType, String idtf, int line) {
			this.idtf = idtf;
			this.returnType = returnType;
			lineBeginning = line;
		}
		
		public List<String> getParameterTypes() {	
			return parameterTypes;
		}
		
		public void setParameterTypes(List<String> parameterTypes) {
			this.parameterTypes = parameterTypes;
		}

		public String getIdentifier() {
			return idtf;
		}

		public void addLineCall(int line) {
			callLines.add(new Integer(line));
		}

//		public String toString() {
//			StringTemplate st = new StringTemplate(
//					".method <name>(<parameters; separator=\", \">)<retType><\n>" +
//					   ".limit stack <maxStackDepth><\n>"+ 
//					   ".limit locals <maxLocals><\n>" +
//					   "<content><\n>" +
//					".end method<\n>",
//					AngleBracketTemplateLexer.class
//				);
//			    st.setAttribute("name", idtf);
//				st.setAttribute("parameters", parameterTypes);
//				st.setAttribute("retType", returnType);
//				st.setAttribute("content", content);
//				st.setAttribute("maxLocals", currentVarNumber);
//				st.setAttribute("maxStackDepth", currentOpNumber);
//				return st.toString();
//		}

		public String getReturnType() {
			return returnType;
		}
		
		public void addVariable(Variable var) {
			variables.add(var);
		}
		
		public void addVarCalled(String varName) {
			Variable variable = variables.get(varName);
			if(variable.getLocalNumber()==-1) {
			variable.setLocalNumber(currentVarNumber++);
			}
		}
		
		public void addVarCalled() {
			currentVarNumber++;
		}
		
		public void addOperation() {
			currentOpNumber++;			
		}
		
		public int getLocalsCount() {
			return currentVarNumber;
		}
		
		public int getOperatorsCount() {
			return currentOpNumber;
		}
		
		public int getVariableLocalNumber(String varName) {
			cachedVarNumber = variables.get(varName).getLocalNumber();
			return cachedVarNumber;
		}
		
		public int getPreviousLocalVarNumberIncremented() {
			cachedVarNumber++;
			return cachedVarNumber;
		}
	}