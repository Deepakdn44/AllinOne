package example;

public class SingleTonTest {
	
	private static SingleTonTest instance = new SingleTonTest();
	
	private SingleTonTest() {
		System.out.println("creating object");
	}
	public static SingleTonTest getInstance() {
		
		return instance;
	}

}
