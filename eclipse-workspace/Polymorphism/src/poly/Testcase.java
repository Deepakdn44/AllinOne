package poly;

public class Testcase extends Base{

	static String browserName = "FF";
	public static void main(String[] args) {
		
		Testcase test = new Testcase();
		WebDriver driver = test.getInstance(browserName);
		driver.click();
		driver.sendKeys();
		driver.getTitle();

	}

}
