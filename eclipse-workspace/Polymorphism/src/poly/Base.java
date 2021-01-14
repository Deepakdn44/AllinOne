package poly;

public class Base {
	
	public WebDriver getInstance(String browserName) {
		
		if(browserName.equals("chrome")) {
			return new ChromeDriver();
		}else if(browserName.equals("FF")) {
			return new FirefoxDriver();
		}else return new WebDriver();
	}

}
