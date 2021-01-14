package regressionTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void creatingDBConnection() {
		System.out.println("Creating DB Connection");
	}
	@AfterTest
	public void closeDBConnection() {
		System.out.println("Closing DB Connection");
	}
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching a browser");
	}
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing a browser");
	}
	
	@Test(priority=2)
	public void doLogin() {
		System.out.println("Executing login test");
	}
	
	@Test
	public void doUserReg() {
		System.out.println("Executing User reg test");
	}
}
