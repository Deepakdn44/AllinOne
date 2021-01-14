import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				//.withTimeout(Duration.ofSeconds(10))
			      // .pollingEvery(Duration.ofSeconds(2))
			       //.withMessage("User defined message")
			       //.ignoring(NoSuchElementException.class);
		
		driver.get("http://www.youtube.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("KGF chapter 1 kannada trailer");
		driver.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/ytd-searchbox/form/button/yt-icon")).click();
		
		driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[2]/div[1]/div/div[1]/div/h3/a/yt-formatted-string")).click();
		driver.findElement((By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[29]/div[2]/div[2]/button[3]"))).click();
		driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[29]/div[2]/div[2]/button[9]")).click();
		
		/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[2]/div[1]/div/div[1]/div/h3/a/yt-formatted-string"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[29]/div[2]/div[2]/button[3]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[29]/div[2]/div[2]/button[9]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[27]/div/div/div[5]/div[2]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[27]/div/div[2]/div[2]/div"))).click();
		*/
		
		
	}

}
