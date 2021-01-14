
public class Autobox {
	
	public static void main(String[] args) {
		int var = 10;
		Integer obj = new Integer(var);//wrapping or Autoboxing
		System.out.println(obj);
		
		int i = obj;//unwrapping or AutoUnboxing
		System.out.println(i);
	
	}

}
