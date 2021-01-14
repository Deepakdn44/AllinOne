import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdowns {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		
		WebElement option = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(option);
		//select.selectByVisibleText("Dansk");
		select.selectByValue("hi");
		
		List<WebElement> values = driver.findElements(By.tagName("option"));
		System.out.println("Count of options in the list is :"+values.size());
		
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i).getText());
		}
		
		System.out.println("---------------------------------------------------------------------------");
		
		WebElement block = driver.findElement(By.xpath("/html/body/div[1]"));
		List<WebElement> links = block.findElements(By.tagName("a"));
		System.out.println("Link size is --"+links.size());
		
		for(WebElement link: links) {
			System.out.println(link.getText()+"URL is ------"+link.getAttribute("href"));
		}
		
		/*Handling the element if id are same
		 * 
		 * WebElement thirdblock = driver.findElement(By.id("blockid"));
		thirdblock.findElements(By.id("abc")).get(2).click();*/
	}

}
