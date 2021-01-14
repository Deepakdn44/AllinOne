
public class AutoBoxing {

	public static void main(String[] args) {
		int v = 90;
		@SuppressWarnings("deprecation")
		Integer obj = new Integer(v); //Wrapping AutoBoxing
		System.out.println(obj);
		int a = obj;// Unboxing UnWrapping
		System.out.println(a);
		

	}

}
