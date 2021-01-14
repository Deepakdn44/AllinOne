import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		//System.out.println(list);
		
		//System.out.println(list.size());
		
		//How to add a value
		list.add(10);
		list.add("Deepu");
		list.add(true);
		list.add(2.67);
		list.add('D');
		list.add("Deepu");

		
		System.out.println(list.size());
		System.out.println(list);
		
		//How to fetch a value
		
		//System.out.println(list.get(1));
		
		/*for(int i=0;i<list.size()-1;i++) {
			System.out.println(list.get(i));
		}*/
		
		
		list.remove(4);
		
		System.out.println(list.size());
		
		/*for(Object var:list) {
			System.out.println(var);
		}*/
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
