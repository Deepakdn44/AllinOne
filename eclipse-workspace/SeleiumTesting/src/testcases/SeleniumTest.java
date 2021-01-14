package testcases;

import org.openqa.selenium.opera.OperaDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver","E:\\Java Lectures\\Selenium\\Executables\\operadriver.exe");
		OperaDriver driver = new OperaDriver();
		driver.get("http://www.way2automation.com");

	}

}
