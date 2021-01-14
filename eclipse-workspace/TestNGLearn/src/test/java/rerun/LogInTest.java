package rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest {
	@Test(priority = 1)
	public void doLogin() {
		System.out.println("Executing log in test");
	}
	
	static int count =0;
	@Test(priority = 2)
	public void registerUser() {
		count++;
		System.out.println(count);
		Assert.assertEquals(count, 1);
	}
}
