package com.w2a.pages;

import com.w2a.base.Page;

public class LogInPage extends Page{

	public ZohoAppPage doLogIn(String username, String password) {
		System.out.println("Inside do login");
		type("//*[@id=\"login_id\"]", username);
		System.out.println("Username");
		click("/html/body/div[5]/div[3]/div[2]/form/button/span");
		type("//*[@id=\"password\"]", password);
		click("/html/body/div[5]/div[3]/div[2]/form/button/span");
		return new ZohoAppPage();
		
	}
}
