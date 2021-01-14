import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("Deepu");
		set.add("Selenium");
		set.add("Way2Automation");
		set.add("Java");
		set.add("Deepu");
		set.add(null);
		
		System.out.println(set);
		
		/*for(String var:set) {
			System.out.println(var);
		}*/
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.equals("Deepu")) {
				System.out.println(str);
			}
			
		}
		
	}

}
