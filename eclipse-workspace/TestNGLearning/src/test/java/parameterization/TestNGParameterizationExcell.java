package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterizationExcell {

	public static ExcelReader excel = null;

	@Test(dataProvider = "getData")
	public void testData(String username, String password, String is_correct) {
		System.out.println(username + "----" + password + "------" + is_correct);
	}

	@DataProvider
	public static Object[][] getData() {

		if (excel == null) {
			excel = new ExcelReader("E:\\Java Lectures\\ExcellWriting\\myexcell.xlsx");
		}	
		String sheetname = "login";
		int row = excel.getRowCount(sheetname);
		int col = excel.getColumnCount(sheetname);
		Object[][] data = new Object[row - 1][col];
		for (int rownum = 2; rownum < row; rownum++) {
			for (int colnum = 0; colnum < col; colnum++) {
				data[rownum - 2][colnum] = excel.getCellData(sheetname, colnum, rownum);
			}
		}
		return data;

	}
}
