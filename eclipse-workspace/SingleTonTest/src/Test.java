
public class Test {

	public static void main(String[] args) {
		SingleTonTest s1 = SingleTonTest.getInstance();
		SingleTonTest s2 = SingleTonTest.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
