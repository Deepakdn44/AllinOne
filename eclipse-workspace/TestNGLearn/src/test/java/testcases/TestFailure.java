package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure extends BaseTest{

	@Test
	public void doLogin() {
		Assert.fail("Failing log in test");
		System.out.println("Capture screenshot");
	}
}
