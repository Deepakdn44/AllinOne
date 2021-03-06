package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCAse2 extends BaseTest{

	@Test
	public void validateTitles() {
		
		System.out.println("Begining");
		String expected = "Yahoo.com";//Excell
		String actual = "Gmail.com";//Selenium
		
		SoftAssert soft = new SoftAssert();
		System.out.println("Validating titles");
		soft.assertEquals(actual, expected);
		System.out.println("Validating image");
		soft.assertEquals(false, true,"Image not found");
		System.out.println("Validating Textbox");
		soft.assertEquals(false, true,"Textbox not found");
		//Assert.assertTrue(false, "Element not found");
		//Assert.fail("Failing a test element not found");
		System.out.println("Ending");
		
		soft.assertAll();
		
	}
}
