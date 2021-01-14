package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rough {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.zoho.com");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys("abcd");
		
		
	}
}
