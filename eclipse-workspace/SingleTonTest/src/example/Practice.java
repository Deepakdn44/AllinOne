package example;

import java.util.HashMap;
import java.util.Map;

public class Practice {

	
	public static void main(String[] args) {
		
		Example e1 = Example().getInstance();
		Example e2 = Example().getInstance();
		
		Map<Example, String> map = new HashMap<Example, String>();
		
		map.put(e1, "Deepu");
		map.put(e2, "Darshan");
		
		System.out.println(map.size());
		
		Integer i = new Integer(1);
		Integer i2 = new Integer(1);
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(i, "Deepu");
		map1.put(i2, "Deepu");
		
		System.out.println(map1.size());
		
		
	}

	private static Example Example() {
		// TODO Auto-generated method stub
		return null;
	}
}

