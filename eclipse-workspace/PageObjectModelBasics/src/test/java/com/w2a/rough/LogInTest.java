package com.w2a.rough;



import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LogInPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;



public class LogInTest {

	public static void main(String[] args) {
		
		HomePage home = new HomePage();
		LogInPage login = home.goToLogIn();
		ZohoAppPage zp = login.doLogIn("Deepakdn444@gmail.com", "Virat18@444");
		zp.gotoCRM();
		Page.menu.goToAccounts();
		AccountsPage acc = Page.menu.goToAdd();
		CreateAccountPage cap = acc.goToCreateAccounts();
		cap.createAccount("Deepak");
		
	}
}
