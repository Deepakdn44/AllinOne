
public class Base 
{
	public WebDriver getBrowserInstance(String Browsername)
	{
		if(Browsername.equals("Firefox"))
		{
			return new FireFoxDriver();
		}
		else if(Browsername.equals("Chrome"))
		{
			return new ChromeDriver();
		}
		else if(Browsername.equals("InternetExplorer"))
		{
			return new IEDriver();
		}
		else
		{
			return new FireFoxDriver();
		}
	}
}
