import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenricsAarrayList {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<Character>();
		list.add('D');
		list.add('E');
		list.add('E');
		list.add('P');
		list.add('U');
		
		char k = list.get(0);
		char l = list.get(1);
		System.out.println('k'+'l');
		
		/*for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}*/
		
		/*for(Object var:list) {
			System.out.println(var);
		}*/
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}

}
