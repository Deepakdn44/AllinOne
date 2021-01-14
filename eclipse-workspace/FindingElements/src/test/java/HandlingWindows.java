import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String first_window = itr.next();
		System.out.println(first_window);
		driver.findElement(By.xpath("//*[@id=\"popupBoxClose\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/div[3]/div/div[3]/div/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[12]/div[3]/div/div/div/div/div[2]/div[2]/div[2]/div[3]/a[1]")).click();
		
		//2nd window
		windows = driver.getWindowHandles();
		itr = windows.iterator();
		System.out.println(itr.next());
		String Second_Window = itr.next();
		System.out.println(Second_Window);
		driver.switchTo().window(Second_Window);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[12]/div[3]/div/div/div/div/div/div[1]/div/div[3]/div/div/div/div[1]/div[3]/div/div[1]/div[1]/div[1]/ul[3]/li/ul/li[5]/a")).click();
		
		//3rd window 
		windows = driver.getWindowHandles();
		itr = windows.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		String third_window = itr.next();
		System.out.println(third_window);
		driver.switchTo().window(third_window);
		System.out.println(driver.getTitle().contains("Merchant Category"));
	}

}
