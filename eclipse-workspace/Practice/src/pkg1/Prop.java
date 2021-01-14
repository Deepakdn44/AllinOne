package pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Prop {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\\\src\\\\pkg2\\\\Object.properties");
		prop.load(fs);
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("course"));
		System.out.println(System.getProperty("user.dir"));
		

	}

}
