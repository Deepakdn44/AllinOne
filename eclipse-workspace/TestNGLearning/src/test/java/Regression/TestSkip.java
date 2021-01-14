package Regression;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip extends BaseTest{
	@Test
	public void isSkip() {
		throw new SkipException("Skipping the test case as the condition is not met");
		
	}
}
