package Package2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestCase extends FireFoxDriver {
	public static void main(String[] args) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\Package1\\Object.properties");
		prop.load(fs);
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Age"));
		System.out.println(System.getProperty("user.dir"));
		TestCase T = new TestCase();
		T.scan();
		T.getKeys();
		T.Property();
		T.show();
		T.print();
		
	}

	@Override
	public void scan() {
		System.out.println("HI");
		
	}

	@Override
	public void getKeys() {
		System.out.println("Hello");
		
	}

	@Override
	public void Property()  {
		System.out.println("How r u..??");
		
		
	}

	
	public void show() {
		System.out.println("Thank you");
		
	}

	@Override
	public void print() {
		System.out.println("Bye Bye");
		
	}

}
