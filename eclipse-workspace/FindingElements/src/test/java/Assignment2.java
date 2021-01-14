import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement block = driver.findElement(By.name("country"));
		Select select = new Select(block);
		select.selectByValue("Chad");
		driver.findElement(By.name("name")).sendKeys("Deepak");
		driver.findElement(By.name("phone")).sendKeys("829698696");
		driver.findElement(By.name("email")).sendKeys("deepak@gmail.com");
		driver.findElement(By.name("city")).sendKeys("Banglore");
		driver.findElement(By.name("username")).sendKeys("deepu444");
		driver.findElement(By.name("password")).sendKeys("jskjdkjahskld");
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input")).click();
	}

}
