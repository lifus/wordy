import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Globals {
	
	private Map<String, String> globalsNamesWithTypes;
	
	public Globals() {
		globalsNamesWithTypes = new HashMap<String, String>();
	}
	
	public String getGlobalTypeByName(String name) {
		return globalsNamesWithTypes.get(name);
	}
	
	public void add(String type, String name) {
		globalsNamesWithTypes.put(name, type);
	}
	
	public Set<Entry<String, String>> globalsNamesWithTypes() {
		return globalsNamesWithTypes.entrySet();
	}
}
