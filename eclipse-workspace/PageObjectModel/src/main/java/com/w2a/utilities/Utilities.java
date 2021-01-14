package com.w2a.utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.w2a.base.Page;


public class Utilities extends Page {

	public static String screenshotname;
	public static String screenshotpath;

	public static void captureScreenshot() throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		screenshotname = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		FileUtils.copyFile(srcFile,
				new File(System.getProperty("user.dir") + "\\test-output\\html\\" + screenshotname));
	}

	@DataProvider(name = "dp")
	public Object[][] getData(Method m) {

		String sheetName = m.getName();
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];

		Hashtable<String,String> table = null;

		for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2

			 table = new Hashtable<String,String>();

			for (int colNum = 0; colNum < cols; colNum++) {

				// data[0][0]
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum - 2][0] = table;
			}

		}

		return data;

	}

	public static boolean isTestRunnable(String testname, ExcelReader excel) {

		
		String sheetName = "test_suite";
		int row = excel.getRowCount(sheetName);

		for (int rnum = 2; rnum < row; rnum++) {
			String testcase = excel.getCellData(sheetName, "TCID", rnum);
			if (testcase.equalsIgnoreCase(testname)) {
				String runmode = excel.getCellData(sheetName, "Runmode", rnum);
				if (runmode.equalsIgnoreCase("Y")) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

}
