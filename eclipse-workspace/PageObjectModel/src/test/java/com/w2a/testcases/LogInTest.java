package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.pages.HomePage;
import com.w2a.pages.LogInPage;
import com.w2a.pages.ZohoAppPage;


public class LogInTest extends BaseTest{
	
	@Test
	public void logInTest() {
		
		HomePage home = new HomePage();
		LogInPage login = home.goToLogIn();
		ZohoAppPage zoho = login.doLogIn("Deepakdn444@gmail.com", "Virat18@444");
		zoho.gotoCRM();

		
	}

}
