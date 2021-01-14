package abstractclass;

public class Test {

	public static void main(String[] args) {
		ChildFirefoxDriver driver = new ChildFirefoxDriver();
		driver.click();
		driver.sendKeys();
		driver.getFirefoxInstance();
		driver.captureScreenshot();
	}

}
