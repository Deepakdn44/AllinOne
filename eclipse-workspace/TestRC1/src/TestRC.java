import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class TestRC {

	public static void main(String[] args) throws Exception {
		SeleniumServer server = new SeleniumServer();
		System.out.println(server.getRealPort());
		Selenium selenium = new DefaultSelenium("localhost", 4444, "*Firefox", "http://gmail.com");
		selenium.start();
		
		

	}

}
