import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int i = driver.findElement(By.xpath("//*[@id=\"mathq2\"]")).getText().charAt(0);
		char j = driver.findElement(By.xpath("//*[@id=\"mathq2\"]")).getText().charAt(2);
		int k = driver.findElement(By.xpath("//*[@id=\"mathq2\"]")).getText().charAt(4);
		int l = i-48;
		int m = k-48;
		int n = 0;
		System.out.println(l);
		System.out.println(j);
		System.out.println(m);
		if(j=='+') {
			n = l + m;
		}else if(j=='-') {
			n = l - m;
		}else if(j=='*') {
			n = l * m;
		}
		System.out.println(n);
		char chr = (char) n;
		String str = ;
		
		
		
		
		
	}

}
