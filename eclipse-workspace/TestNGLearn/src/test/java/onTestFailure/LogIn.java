package onTestFailure;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogIn extends Basetest{
	
	@Test(priority = 1)
	public void doLogin() {
		
		driver.findElement(By.id("identifierId1")).sendKeys("deepakdn444@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")).click();
		
	}
	@Test
	public void composeEmail() {
		Assert.fail("Error in composing email");
	}

}
