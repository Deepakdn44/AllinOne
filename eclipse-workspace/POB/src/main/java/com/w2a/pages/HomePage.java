package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class HomePage extends Page {

	public void goToSupport() {

		driver.findElement(By.cssSelector(".signing>a:nth-child(2)")).click();

	}

	public void goToSignUp() {

		driver.findElement(By.cssSelector(".signup")).click();
	}

	public LogInPage goToLogin() {

		click("loginlink_CSS");

		return new LogInPage();
	}

	public void goToZohoEdu() {

	}

	public void goToLearnMore() {

	}

	public void validateFooterLinks() {

	}
}
