package abstractclass;

public class ChildFirefoxDriver extends FirefoxDriver {

	@Override
	public void click() {
		System.out.println("Click");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("Typing");
		
	}

	@Override
	public void getFirefoxInstance() {
		System.out.println("get Instance");
		
	}

}
