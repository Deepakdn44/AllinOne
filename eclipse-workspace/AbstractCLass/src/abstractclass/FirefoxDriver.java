package abstractclass;

public abstract class FirefoxDriver extends WebDriver{

	public abstract void getFirefoxInstance();
	public void captureScreenshot() {
		System.out.println("Screenshot");
	}
}
