import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//System.out.println(list);
		//System.out.println(list.size());
		list.add(10);
		list.add("Deepu");
		list.add(true);
		list.add(12.56);
		list.add("Deepu");
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		
		list.remove(2);
		
		System.out.println(list);
		
		/*for(Object var :list) {
			System.out.println(var);
		}*/
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
