package parellelTest;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParellelDP {

	@Test(dataProvider = "getData")
	public void getBrowser(String browser) {
		Date d = new Date();
		System.out.println("browser name ===== "+browser+"-----"+d);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@DataProvider(parallel = true)
	public Object[][] getData() {
		Object[][] data = new Object[2][1];
		
		data[0][0] = "chrome";
		data[1][0] = "firefox";
		return data;
	}
	
		
}