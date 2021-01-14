package capturescreenshot;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
	
	@Test
	public void login() {
		System.out.println("Loggingg in!!!!!!!!");
	}
	static int count = 0;
	@Test
	public void userReg() {
		count++;
		System.out.println(count);
		Assert.assertEquals(count, 3);
	}
}



