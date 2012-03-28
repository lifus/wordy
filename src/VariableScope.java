import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VariableScope {
	
	private HashMap<String, Variable> variables = new HashMap<String, Variable>();
	
	public boolean varDeclared(String name) {
		return variables.containsKey(name);
	}
	
	public void add(Variable var) {
		variables.put(var.getIdentifier(), var);
	}
	
	public Variable get(String varName) {
		Variable variable = variables.get(varName); 
		return variable;
	}
	
	public List<Variable> getAll() {
		return new ArrayList<Variable>(variables.values());
	}
	
	public void print(PrintStream out) {
		for (String idtf : variables.keySet()) {
			Variable n = variables.get(idtf);
			out.println(n);
		}
	}
}




