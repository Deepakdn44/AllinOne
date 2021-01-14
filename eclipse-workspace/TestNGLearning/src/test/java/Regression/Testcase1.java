package Regression;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1 extends BaseTest{
	@Test(priority=1)
	public void doUserreg() {
		System.out.println("User reg successfull");
		Assert.fail("User reg Unsuccessfull");
	}
	@Test(priority=2, dependsOnMethods = "doUserreg")
	public void doLogin() {
		System.out.println("Log in successfull");
	}
	@Test(priority=3, dependsOnMethods = "doLogin", alwaysRun = true)
	
	public void thirdTest() {
		System.out.println("Third test case");
	}
	@Test(priority=4)
	public void fourthTest() {
		System.out.println("Fourth test case");
	}
}
