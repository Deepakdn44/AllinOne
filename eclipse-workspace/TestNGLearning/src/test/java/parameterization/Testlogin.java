package parameterization;

import org.testng.annotations.Test;

public class Testlogin {
	@Test(dataProviderClass=DataProviders.class, dataProvider = "dp1")
	public void testLogin(String username, String password) {
		System.out.println(username+"------"+password);
	}
	@Test(dataProviderClass=DataProviders.class, dataProvider="dp1")
	public void testUserreg(String username, String lastname, String password) {
		System.out.println(username+"-------"+lastname+"------"+password);
	}

}
