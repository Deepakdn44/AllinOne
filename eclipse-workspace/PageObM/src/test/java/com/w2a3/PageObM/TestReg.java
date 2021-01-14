package com.w2a3.PageObM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestReg {

	@Test
	public void verifyFlight() {

		//System.setProperty("webdriver.firefox.marionette", "E:\\Java Lectures\\Softwares\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		RegPage RGPage = new RegPage(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");

		RGPage.clickRegLink();
		RGPage.setFirstName("Deepak");
		RGPage.setLastName("N");
		RGPage.setPhone("9538972444");
		RGPage.setEmail("deepakdn@gmail.com");
		RGPage.setAddress1("agaksjgdkjgaskdkajs");
		RGPage.setAddress2("sjdhkajshdkhaslkd");
		RGPage.setCity("Banglore");
		RGPage.setState("Karnataka");
		RGPage.setPostalCode("560068");
		RGPage.setCountry("INDIA");
		RGPage.setUsername("deepak");
		RGPage.setPassword("deepu");
		RGPage.setConfirm("deepu");
		RGPage.clickSubmit();

		driver.close();

	}

}
