package parallel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestInvocationCount {

	@Test(invocationCount=2)
	public void run() {
		
		BaseTest bt = new BaseTest();
		String drive = "firefox";
		WebDriver driver;
		driver = bt.getDriver(drive);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle()); 
		
		driver.quit();
	}
}
