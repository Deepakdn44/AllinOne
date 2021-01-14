package testcase;

import com.w2a.selenium.WebDriver;
import com.w2a.selenium.chromedriver.ChromeDriver;
import com.w2a.selenium.firefox.FirefoxDriver;
import com.w2a.selenium.iedriver.IEDriver;

public class test {

	public static String browser = "IE";
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("IE")) {
			driver = new IEDriver();
		}

		driver.get("//http:www.w2a.com");
		driver.getTitle();
		driver.click();
		driver.sendKeys();

	}

}
