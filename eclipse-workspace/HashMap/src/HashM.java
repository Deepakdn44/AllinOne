import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashM {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Firstname", "Deepak");
		map.put("Lastname", "N");
		map.put("Course", "Selenium");
		map.put("Content", "Way2Automation");
		//map.put("Firstname", "Darshan");
		//System.out.println(map);
		
		System.out.println(map.get("Firstname"));
		
		Set<String> key = map.keySet();
		for(String keys:key) {
			System.out.println("Key is ---->"+keys+" Value is ---->"+map.get(keys));
		}

	}
	

}
