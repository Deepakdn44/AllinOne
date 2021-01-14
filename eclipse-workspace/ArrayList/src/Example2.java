import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(23);
		list.add(45);
		list.add(null);
		
		int i = list.get(0);
		int j = list.get(1);
		System.out.println(i+j);
		
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
	}
}
