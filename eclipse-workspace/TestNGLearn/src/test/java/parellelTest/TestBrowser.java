package parellelTest;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowser {

	@Parameters({"browser"})
	@Test
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
}
