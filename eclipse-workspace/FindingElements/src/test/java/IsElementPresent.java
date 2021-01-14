import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsElementPresent {
	
	public static WebDriver driver;
	
	public static boolean isElementPresent(By locator) {
		
		try {
		driver.findElement(locator);
		return true;
		}
		catch(Throwable t){
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(isElementPresent(By.id("searchLanguage")));
	}

}
