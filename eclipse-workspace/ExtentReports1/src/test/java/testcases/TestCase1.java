package testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCase1 {

	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setReport() {
		
		htmlreporter = new ExtentHtmlReporter("./reports/extent.html");
		htmlreporter.config().setEncoding("utf-8");
		htmlreporter.config().setDocumentTitle("W2a Automation reports");
		htmlreporter.config().setReportName("Automation test result");
		htmlreporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		extent.setSystemInfo("Automation tester", "Deepak");
		extent.setSystemInfo("Organization", "Selenium");
		extent.setSystemInfo("Build number", "W2a444");
	}
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	
	@Test
	public void doLogIn() {
		test = extent.createTest("LogIN Test");
		System.out.println("Executing login test");
	}
	@Test
	public void userReg() {
		test = extent.createTest("User Reg Test");
		Assert.fail("Failing the user reg test");
	}
	@Test
	public void skip() {
		test = extent.createTest("Skip Test");
		throw new SkipException("Skipping the testcase");
	}
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			String methodName = result.getMethod().getMethodName();
			String logText = "<b>"+"TEST CASE : -"+methodName.toUpperCase()+"     FAILED"+"</b>";
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
			test.fail(m);
			
		}else if(result.getStatus() == ITestResult.SKIP) {
			String methodName = result.getMethod().getMethodName();
			String logText = "<b>"+"TEST CASE : -"+methodName.toUpperCase()+"     SKIPPED"+"</b>";
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.ORANGE);
			test.skip(m);
			
		}else if(result.getStatus() == ITestResult.SUCCESS) {
			
			String methodName = result.getMethod().getMethodName();
			String logText = "<b>"+"TEST CASE : -"+methodName.toUpperCase()+"     PASSED"+"</b>";
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			test.pass(m);
		}
	}
}
