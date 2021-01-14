package com.w2a.selenium.firefox;

import com.w2a.selenium.WebDriver;

public class FirefoxDriver implements WebDriver{
	
	public FirefoxDriver() {
		System.out.println("Launchong Firefox");
	}
	public void get(String url) {
		System.out.println("getting url in firefox");
	}
	public void getTitle() {
		System.out.println("getting title in firefox");
	}
	public void click() {
		System.out.println("Clicking on firefox");
	}
	public void sendKeys(){
		System.out.println("typing on firefox");
	}

}
