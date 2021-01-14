package capturescreenshot;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
	
	@Test(priority=1)
	public void login() {
		
		driver.findElement(By.id("Email")).sendKeys("deepakdn444@gmail.com");
		driver.findElement(By.id("next")).click();
	}

}
