package parameterization;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name = "dp1")
	public static Object[][] getData(Method m){
		Object[][] data = null;
		
		if(m.getName().equals("testLogin")) {
		data = new Object[2][2];
		
		data[0][0] = "deepu";
		data[0][1] = "sdkjfladjf";
		
		data[1][0] = "darshan";
		data[1][1] = "safdlkdshflhalk";
		}else if(m.getName().equals("testUserreg")) {
			data = new Object[2][3];
			
			data[0][0] = "deepu";
			data[0][1] = "n";
			data[0][2] = "sdlfkjladkfjlaf";
			
			data[1][0] = "darshan";
			data[1][1] = "s u";
			data[1][2] = "jkhskdfjkljf";
		}
		
		return data;
	}
	/*@DataProvider(name = "dp2")
	public static Object[][] getData1(){
		Object[][] data = new Object[2][3];
		
		data[0][0] = "deepu";
		data[0][1] = "n";
		data[0][2] = "sdlfkjladkfjlaf";
		
		data[1][0] = "darshan";
		data[1][1] = "s u";
		data[1][2] = "jkhskdfjkljf";
		
		return data;
	}*/

}
