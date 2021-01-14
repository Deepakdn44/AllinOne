package reports;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase {

	@Test
	public void doLogin() {
		
		System.out.println("Executing log in test");
	}
	@Test
	public void doUserreg() {
		
		Assert.fail("Failing the user reg");
	}
	@Test
	public void isSkip() {
		
		throw new SkipException("Skipping the test case");
	}
}
