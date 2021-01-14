package array;

public class Test {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		for(int i=0;i<a.length;i++) {
			a[i] = (int)(Math.random()*100);
			//System.out.println(a[i]);
		}
		
		for(int var:a) {
			System.out.println(var);
		}
		//System.out.println(a.length);
		
		
	}

}
