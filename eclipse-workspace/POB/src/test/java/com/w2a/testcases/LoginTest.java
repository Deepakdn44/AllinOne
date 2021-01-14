package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.pages.HomePage;
import com.w2a.pages.LogInPage;
import com.w2a.utilities.Utilities;

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data){
		
		HomePage home = new HomePage();
		LogInPage lp = home.goToLogin();
		lp.doLogin(data.get("username"), data.get("password"));
		//Assert.fail("Login test failed");
	
		
	}

}
