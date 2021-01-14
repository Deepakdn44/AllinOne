package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {
	
	//Top Menu is a page
	// Every page has a Top Menu
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}
	public void goToHome() {
		
	}
	public void goToLeads() {
		
	}
	public void goToContacts() {
		
	}
	public void goToAccounts() {
		driver.findElement(By.xpath("/html/body/div[13]/div[10]/div[1]/crm-menu/div[1]/crm-tab/div[2]/div[4]/a")).click();
	}
	public void goToDeals() {
		
	}
	public void goToActivities() {
		
	}
	public void goToReports() {
		
	}
	public AccountsPage goToAdd() {
		driver.findElement(By.xpath("//*[@id=\"createIcon\"]")).click();
		return new AccountsPage();
		
	}
	public void goToSignOut() {
		
	}
	
}
