package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	@Test(dataProvider="getData")
	public void doLogin(String username, String password) {
		System.out.println(username+"-----"+password);
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "trainer@way2automation.com";
		data[0][1] = "sfdhgaldfjhk";
		
		data[1][0] = "Java@way2automation.com";
		data[1][1] = "oioiuyoweoq";
		
		data[2][0] = "test@way2automation.com";
		data[2][1] = "lkjlkjlkjll";
		
		return data;
	}
}
