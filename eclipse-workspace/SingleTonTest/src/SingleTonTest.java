
public class SingleTonTest {
	
	private static SingleTonTest instance = new SingleTonTest();
	private  SingleTonTest() {
		System.out.println("Cretating an object");
	}
	public static SingleTonTest getInstance() {
		return instance;
		
	}
}

