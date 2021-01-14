package TestCase;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	public static String browser = "Firefox";
	public static ChromeDriver driver;

	public static void main(String[] args) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromeDriver().setup();
			
		}
		

	}

}
