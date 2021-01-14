package captureListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listners implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed Test "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"E:\\Java Lectures\\SeleniumTesting\\New folder\\logo.jpg\"target = \"_blank\">Screen shot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"E:\\Java Lectures\\SeleniumTesting\\New folder\\logo.jpg\"target = \"_blank\"><img height=100, width=100 src=\"E:\\Java Lectures\\SeleniumTesting\\New folder\\logo.jpg\"></a>");
		
		System.out.println("Capturing Screenshot for the failed test"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}



}
