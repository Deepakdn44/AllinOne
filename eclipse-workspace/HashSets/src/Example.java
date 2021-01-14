import java.util.HashSet;
import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Deepu");
		set.add("Ammu");
		set.add("Akash");
		set.add("gunda");	
		set.add("Deepu");
		
		System.out.println(set);
		System.out.println(set.size());
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String var = itr.next();
			if(var.equals("Deepu")) {
			System.out.println(var);
			}
		}
		
		
	}
}
