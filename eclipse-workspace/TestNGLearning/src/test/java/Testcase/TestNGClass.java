package Testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching Browser");
	}
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing Browser");
	}
	@Test(priority=1)
	public void doUserReg() {
		System.out.println("Creating User Reg");
	}
	@Test(priority=2)
	public void doLogin() {
		System.out.println("Creating log in");
	}
	@BeforeTest
	public void openDBConn() {
		System.out.println("Openeing DB connection");
	}
	@AfterTest
	public void closeDBConn() {
		System.out.println("Closing DB connection");
	}

}
