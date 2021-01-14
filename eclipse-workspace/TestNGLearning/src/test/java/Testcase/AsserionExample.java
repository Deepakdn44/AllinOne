package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserionExample {
	@Test(priority=2)
	public void validateTitles() {
		String expected_title = "yahoo.com";
		String actual_title = "gmail.com";
		SoftAssert sassert = new SoftAssert();
		
		sassert.assertEquals(actual_title, expected_title);
		sassert.assertTrue(false, "Text box not present");
		sassert.assertEquals(false, true, "Test fail");
		sassert.assertAll();
		
	}
	@Test(priority=1)
	public void fail() {
		Assert.assertTrue(false, "Testcase is failed");
	}
	@Test
	public void Fail() {
		Assert.fail("Failing the Test case");
	}

}
