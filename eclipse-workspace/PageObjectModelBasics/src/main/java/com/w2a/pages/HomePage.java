package com.w2a.pages;

import org.openqa.selenium.By;
import com.w2a.base.Page;

public class HomePage extends Page{
	

	public void goToSupport() {
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[2]")).click();
	}
	public void goToSignUP() {
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[5]")).click();
	}
	
	public LogInPage goToLogIn() {
		click("LogIn_XPATH");
		return new LogInPage();
	}
	public void goToZohoEdu() {
		
	}
	public void goToLearnMore() {
		
	}
	public void validateFooterLinks() {
		
	}
}
