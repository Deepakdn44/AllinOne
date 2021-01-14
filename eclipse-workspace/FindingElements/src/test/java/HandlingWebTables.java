import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebTables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> rowNum = driver.findElements(By.xpath("/html/body/div[2]/div[5]/table/tbody/tr"));
		System.out.println("Total row size is  -- "+rowNum.size());
		List<WebElement> colsNum = driver.findElements(By.xpath("/html/body/div[2]/div[5]/table/tbody/tr[1]/td"));
		System.out.println("Total col size is ----- "+colsNum.size());
		
		for(int i=1;i<=rowNum.size();i++) {
			for(int j=1;j<=colsNum.size();j++) {
				System.out.print(driver.findElement(By.xpath("/html/body/div[2]/div[5]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
			System.out.println();
		}
	}

}
