import java.util.HashSet;
import java.util.Iterator;

public class HSets {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Deepu");
		set.add("Darshan");
		set.add("Madan");
		set.add("Sanjeev");
		set.add("Deepu");
		
		System.out.println(set);
		
		/*for(String var:set) {
			System.out.println(var);
		}
		
		System.out.println(set.size());*/
		
		Iterator<String> itr = set.iterator();
		/*while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.equals("Deepu")) {
				System.out.println(str);
			}
		}
		
		

	}

}
