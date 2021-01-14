package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterizationExcell {
	
	public static ExcelReader excel = null;

	@Test(dataProvider = "getData")
	public void testData(String username, String password, String is_correct) {
		System.out.println(username+"--------"+password+"------"+is_correct);
	}
	
	@DataProvider
	public static Object[][] getData(){
		
		if(excel==null) {
			excel = new ExcelReader("E:\\New folder\\testng.xlsx");
		}
		String sheetname = "logintest";
		int row = excel.getRowCount(sheetname);
		int col = excel.getColumnCount(sheetname);
		Object[][] data = new Object[row-1][col];
		for(int rowNum=2;rowNum<row;rowNum++) {
			for(int colNum=0;colNum<col;colNum++) {
				data[rowNum-2][colNum] = excel.getCellData(sheetname, colNum, rowNum);
			}
		}
		return data;
		
	}
}
