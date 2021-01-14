package poly1;

public class Test extends Base{
	public static void main(String[] args) {
		 String browserName = "IE";
		 Test t = new Test();
		 WebDriver driver = t.getInstance(browserName);
		 driver.click();
		 driver.sendKeys();
		 driver.getTitle();
	}

}
