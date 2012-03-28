import java.util.HashMap;

public class FunctionsTable {

	private HashMap<String, Function> functions = new HashMap<String, Function>();
	private Function currentFunction;

	public boolean isDeclared(String name) {
		return functions.containsKey(name);
	}

	public void add(Function addedFunction) {
		currentFunction = addedFunction;
		functions.put(addedFunction.getIdentifier(), addedFunction);
	}
	
	public Function get(String n) {
		Function _n = functions.get(n);
		return _n;
	}
	
	public Function getCurrentFunction() {
		return currentFunction;
	}
}
