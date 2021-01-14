



import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
	
	@Test
	public void login() {
		
		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Deepak");
	}
}
