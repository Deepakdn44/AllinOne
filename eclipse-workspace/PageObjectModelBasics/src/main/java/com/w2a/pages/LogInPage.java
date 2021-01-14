package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class LogInPage extends Page{

	public ZohoAppPage doLogIn(String username, String password) {
		System.out.println("Inside do login");
		driver.findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys(username);
		System.out.println("Username");
		click("Click1_XPATH");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		click("Click2_XPATH");
		return new ZohoAppPage();
	}
}
