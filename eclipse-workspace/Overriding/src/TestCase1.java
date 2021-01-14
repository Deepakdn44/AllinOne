
public class TestCase1 extends Base
{
	String BrowserName = "Chrome";
	public static void main(String[] args) 
	{	
		TestCase1 obj = new TestCase1();
		obj.intBrowser();

	}
	public void intBrowser()
	{
		WebDriver driver = getBrowserInstance(BrowserName);
		driver.click();
		driver.getTitle();
		driver.sendKeys();
	}

}
