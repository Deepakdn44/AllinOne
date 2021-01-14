
public class ChildeFireFoxDriver extends FireFoxDriver
{

	@Override
	public void click() {
		System.out.println("Click on firefox");
	}

	@Override
	public void sendKeys() {
		System.out.println("typing on Firefox");
	}

	@Override
	public void getTitle() {
		System.out.println("get Forefox");
	}
	
}
