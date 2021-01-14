import org.openqa.selenium.server.SeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

@SuppressWarnings("deprecation")
public class RCDay1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		SeleniumServer server = new SeleniumServer();
		server.start();
		server.stop();
		Selenium selenium = new DefaultSelenium("localhost", 4444, "*Firefox", "http://gmail.com");
		Selenium.start();
		
		

	}

}
