import java.util.Stack;

public class VariableScopesHandler {
	
	private Stack<VariableScope> scopes;
	
	public VariableScopesHandler() {
		scopes = new Stack<VariableScope>();
	}
	
	public void enterScope(VariableScope scope) {
		scopes.push(scope);
	}
	
	public VariableScope leaveScope() {
		return scopes.pop();
	}
	
	public boolean isVariableDeclared(String varName) {
		boolean result = false;
		
		for(VariableScope scope : scopes) {
			if(scope.varDeclared(varName)) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	public VariableScope getNearestScopeWithVar(String varName) {
		VariableScope result = null;
		
		for(int i = scopes.size()-1; i >= 0; i--) {
			VariableScope scope = scopes.get(i);
			if(scope.varDeclared(varName)) {
				result = scope;
				break;
			}
		}
		
		return result;
	}
	
	public VariableScope getCurrentScope() {
		return scopes.peek();
	}
	
	public boolean isGlobalScope() {
		boolean result = false;
		
		if(scopes.size() == 1) {
			result = true;
		}
		
		return result;
	}
}
