package com.w2a.selenium.iedriver;

import com.w2a.selenium.WebDriver;

public class IEDriver implements WebDriver{
	public IEDriver() {
		System.out.println("Launchong IE");
	}
	public void get(String url) {
		System.out.println("getting url in IE");
	}
	public void getTitle() {
		System.out.println("getting title in IE");
	}
	public void click() {
		System.out.println("Clicking on IE");
	}
	public void sendKeys(){
		System.out.println("typing on IE");
	}

}
