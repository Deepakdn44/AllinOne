package example;

public class Test {

	public static void main(String[] args) {
		SingleTonTest test = SingleTonTest.getInstance();
		SingleTonTest test1 = SingleTonTest.getInstance();
		
		System.out.println(test);
		System.out.println(test1);
		System.out.println(test==test1);
		
	
	}
}
