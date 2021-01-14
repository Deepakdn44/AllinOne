package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page{

	public CreateAccountPage goToCreateAccounts() {
		driver.findElement(By.xpath("//*[@id=\"submenu_Accounts\"]")).click();
		return new CreateAccountPage();
	}
}
