package poly1;

public class Base {
	
	public WebDriver getInstance(String browserName) {
		if(browserName.equals("firefox")) {
			return new FirefoxDriver();
		}else if(browserName.equals("chrome")) {
			return new ChromeDriver();
		}else if(browserName.equals("IE")) {
			return new IEDriver();
		}else {
			return new WebDriver();
		}
	}
	

}
