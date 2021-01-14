
public class ExamplevarArgs {

	public static void main(String[] args) {
		int sum = fun(10,19,30,78,64,10,10,10);
		System.out.println("sum of numbers is "+sum);
	}
	public static int fun(int... a) {
		System.out.println("Lenghth :"+a.length);
		int sum=0;
		for(int i :a) {
			
			sum=sum+i;
		}
		return sum;
	}
}
