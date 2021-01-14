package parameterization;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterizationExcellHashtable {
	
	public static ExcelReader excel = null;
	@Test(dataProvider = "getData")
	public void testData(Hashtable<String, String> data) {
		//System.out.println(username+"--------"+password+"-------"+is_correct);\
		System.out.println(data.get("username")+"----"+data.get("password"));
	}
	
	@DataProvider
	public static Object[][] getData(){
		if(excel==null) {
			excel = new ExcelReader("E:\\Java Lectures\\ExcellWriting\\myexcell.xlsx");
		}
		String sheetName = "login";
		int row = excel.getRowCount(sheetName);
		int col = excel.getColumnCount(sheetName);
		Object[][] data = new Object[row-1][1];
		Hashtable<String, String> table = null;
		for(int rownum=2;rownum<=row;rownum++) {
			table = new Hashtable<String, String>();
			for(int colnum=0;colnum<col;colnum++) {
				//data[rownum-2][colnum] = excel.getCellData(sheetName, colnum, rownum);
				table.put(excel.getCellData(sheetName, colnum, 1), excel.getCellData(sheetName, colnum, rownum));
				data[rownum-2][0] = table;
			}
		}
		
		return data;
	}

}
