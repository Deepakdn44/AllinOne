package pkg1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//System.out.println(list.size());
		//System.out.println(list);
		list.add("Deepu");
		list.add('D');
		list.add(12);
		list.add(12.59);
		
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
