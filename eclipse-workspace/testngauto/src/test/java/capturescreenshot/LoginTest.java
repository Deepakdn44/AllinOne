package capturescreenshot;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
	
	@Test(priority=1)
	public void login() {
		
		driver.findElement(By.id("identifierId1")).sendKeys("deepakdn444@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
	}
	
	@Test(priority=2)
	public void composeEmail() {
		Assert.fail("Error in composing Email");
	}
	
}
