import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Locals {

	private Map<String, String> localsNamesWithTypes;
	
	public Locals() {
		localsNamesWithTypes = new HashMap<String, String>();
	}
	
	public String getLocalsTypeByName(String name) {
		return localsNamesWithTypes.get(name);
	}
	
	public void add(String type, String name) {
		localsNamesWithTypes.put(name, type);
	}
	
	public Set<Entry<String, String>> globalsNamesWithTypes() {
		return localsNamesWithTypes.entrySet();
	}
}
