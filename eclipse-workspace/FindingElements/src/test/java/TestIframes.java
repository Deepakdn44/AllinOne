import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIframes {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
		//driver.findElement(By.xpath("/html/body/button")).click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("myFunction()");
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", driver.findElement(By.id("mySubmit")));
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("E:\\Java Lectures\\SeleniumTesting\\New folder\\error.jpg"));
		driver.switchTo().defaultContent();
		
		
		List<WebElement> list = driver.findElements(By.tagName("iFrame"));
		System.out.println(list.size());
		for(WebElement lists: list) {
			System.out.println(lists.getAttribute("id"));
		}
	}

}