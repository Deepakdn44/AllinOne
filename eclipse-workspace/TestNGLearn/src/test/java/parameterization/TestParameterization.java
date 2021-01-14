package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@Test(dataProvider = "getData")
	public void doLogin(String username, String password) {
		System.out.println(username+"--------"+password);
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		data[0][0] = "deepakdn444@gmail.com";
		data[0][1] = "asfdasdfm";
		
		data[1][0] = "arpithar@gmail.com";
		data[1][1] = "safdadsffas";
		
		data[2][0] = "trainer@gmail.com";
		data[2][1] = "fsgfsdsgx";
		
		return data;
	}

}
