package com.w2a.pages;

import org.openqa.selenium.By;
import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{

	public CRMHomePage gotoCRM() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[6]/div/a/span")).click();
		return new CRMHomePage();
	}
	public void gotoConnect() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[5]/div/a/span")).click();
	}
	public void gotoCampaigns() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[3]/div/a/span")).click();
	}
}
