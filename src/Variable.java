import java.util.ArrayList;

public class Variable {
	private String idtf;
	private String type;
	private int lineDeclaration;
	private ArrayList<Integer> linesUses = new ArrayList<Integer>();
	private int localNumber;

	public Variable(String idtf, String type, int line) {
		this.idtf = idtf;
		this.type = type;
		lineDeclaration = line;
		localNumber = -1;
	}
	
	public String getIdentifier() {
		return idtf;
	}

	public void addLineUses(int line) {
		linesUses.add(new Integer(line));
	}

	public String toString() {
		return idtf + ", " + type + ", " + lineDeclaration + ", "
				+ ((linesUses.isEmpty()) ? "not used" : linesUses);
	}

	public String getType() {
		return type;
	}

	public int getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(int localNumber) {
		this.localNumber = localNumber;
	}
}