package TestCases;

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
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	@SuppressWarnings("deprecation")
	public void setReport() {
		htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("W2A Automation reports");
		htmlReporter.config().setReportName("Automation test results");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Automation Tester", "Deepak");
		extent.setSystemInfo("Organization ", "Way2Automation");
		extent.setSystemInfo("Build number", "W2A-1234");
	}
	
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	
	@Test
	public void doLogin() {
		test = extent.createTest("Login Test");
		System.out.println("Executing log in test");
	}
	@Test
	public void doUserreg() {
		test = extent.createTest("UserReg test");
		Assert.fail("Failing the user reg");
	}
	@Test
	public void isSkip() {
		test = extent.createTest("Skip Test");
		throw new SkipException("Skipping the test case");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result	) {
		if(result.getStatus() == ITestResult.FAILURE) {
			
			String methodname = result.getMethod().getMethodName();
			
			String logText = "<b>"+"TEST CASE---"+methodname.toUpperCase()+"   FAILED "+"</b>";
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
			test.fail(m);
			
		}else if(result.getStatus() == ITestResult.SKIP) {
			
			String methodname = result.getMethod().getMethodName();
			
			String logText = "<b>"+"TEST CASE---"+methodname.toUpperCase()+"   SKIPPED "+"</b>";
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
			test.skip(m);
		}else if(result.getStatus() == ITestResult.SUCCESS) {
			
			String methodname = result.getMethod().getMethodName();
			
			String logText = "<b>"+"TEST CASE---"+methodname.toUpperCase()+"   PASSED "+"</b>";
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			test.pass(m);
		}
	}
}
