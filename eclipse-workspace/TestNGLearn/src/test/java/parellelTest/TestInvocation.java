package parellelTest;

import org.testng.annotations.Test;

public class TestInvocation extends BaseTest{

	@Test(invocationCount = 4, threadPoolSize = 2)
	public void executeTest() {
		driver = getDriver("firefox");
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		driver.quit();
	}
}

