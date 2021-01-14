import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//System.out.println(list);
		
		//System.out.println(list.size());
		
		list.add(10);
		list.add("Deepu");
		list.add('D');
		list.add(true);
		list.add(10.75);
		
		//System.out.println(list.size());  // To get the size of the array list
		//System.out.println(list);
		
		//System.out.println(list.get(2));  To get an exact elements
		
		//list.remove(2);    To remove elements from an array list
		
		/*for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}*/
		
		
		/*for(Object var:list) {			
			System.out.println(var);
		}*/
		
		Iterator itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
		
		}
			
		
		
	}
		


