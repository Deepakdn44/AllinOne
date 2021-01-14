
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> list = new ArrayList<String>();
		list.add("deepudn@gmail.com");
		list.add("arpitharsgr@gmail.com");
		list.add("akashrsgr@gmail.com");
		
		map.put("Email", list);
		
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		
		for(String key:keys) {
			System.out.println("Key is --->"+key+"  Value is --->"+map.get(key));
		}
		
		
	}

}
