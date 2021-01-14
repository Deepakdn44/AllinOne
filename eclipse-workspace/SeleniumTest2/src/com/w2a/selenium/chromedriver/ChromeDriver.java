package com.w2a.selenium.chromedriver;

import com.w2a.selenium.WebDriver;

public class ChromeDriver implements WebDriver{

	public ChromeDriver() {
		System.out.println("Launchong Chrome");
	}

	public void get(String url) {
		System.out.println("getting url in Chrome");
	}

	public void getTitle() {
		System.out.println("getting title in Chrome");
	}

	public void click() {
		System.out.println("Clicking on Chrome");
	}

	public void sendKeys() {
		System.out.println("typing on Chrome");
	}

}
