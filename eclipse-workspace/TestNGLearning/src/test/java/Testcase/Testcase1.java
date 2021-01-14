package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1 {
	@Test(priority=1, groups="smoke")
	public void doUserreg() {
		System.out.println("User reg successfull");
		Assert.fail("User reg Unsuccessfull");
	}
	@Test(priority=2, dependsOnMethods = "doUserreg", groups= {"smoke", "functional"})
	public void doLogin() {
		System.out.println("Log in successfull");
	}
	@Test(priority=3, dependsOnMethods = "doLogin", alwaysRun = true, groups= {"smoke", "functional"})
	
	public void thirdTest() {
		System.out.println("Third test case");
	}
	@Test(priority=4, groups="dvt")
	public void fourthTest() {
		System.out.println("Fourth test case");
	}
}
