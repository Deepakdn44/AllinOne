import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(12);
		
		System.out.println(v.capacity());
		
		v.remove(1);
		
		System.out.println(v);
	}

}
