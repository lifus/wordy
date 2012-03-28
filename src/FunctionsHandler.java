import java.util.List;

public class FunctionsHandler {
	
	private FunctionsTable functions;
	
	public FunctionsHandler(FunctionsTable functions) {
		this.functions = functions;
	}
	
	public boolean isParametersCorrect(String name, List<String> parameterTypes) {
		boolean result = false;
		
		Function function = functions.get(name);
		if(function != null){
			List<String> typesDeclared = function.getParameterTypes();
			if((typesDeclared == null) || typesDeclared.isEmpty()) {
				if((parameterTypes == null) || parameterTypes.isEmpty()) {
					result = true;
				}
			}
			else if(typesDeclared.equals(parameterTypes)) {
				result = true;
			}
		}
		
		return result;
	}
}
