package interfacew;

public class Testcase extends ChildFirefox{

	@Override
	public void click() {
		System.out.println("Clicking on element");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("Typing on screen");
		
	}

	@Override
	public void getTitle() {
		System.out.println("getting title of the web page");
		
	}

	@Override
	public void maximize() {
		System.out.println("maximize the screen");		
	}

}
