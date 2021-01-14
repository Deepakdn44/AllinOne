import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example {

	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("First Name", "Deepu");
		map.put("Last Name", "Nataraj");
		map.put("Subject", "Selenium");
		map.put("Age", "56");
		map.put("Subject", "Testing");
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get("First Name"));
		
		Set<String> keys = map.keySet();
		
		for(String key:keys) {
			System.out.println("Key--->"+key+"  value is --->"+map.get(key));
		}
	
		
	
	}
}
