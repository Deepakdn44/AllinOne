import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("FirstName", "Deepu");
		map.put("LastName", "Nataraj");
		map.put("Course", "Selenium");
		map.put("Salary", "100000");
		map.put(null, "Deepu");
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get("FirstName"));
		
		Set<String> keys = map.keySet();
		for(String key:keys) {
			System.out.println("Key is--->"+key+"Value is---->"+map.get(key));
		}
		
		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		List<String> listofEmails = new ArrayList<String>();
		
		listofEmails.add("deepakdn444@gmail.com");
		listofEmails.add("arpithar@gmail.com");
		listofEmails.add("suma@gmail.com");
		
		map1.put("Email", listofEmails);
		
		System.out.println(map1);
		
		
		
	}

}
