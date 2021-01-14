package com.w2a3.PageObM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegPage {

	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]")
	WebElement RegLink;
	
	@FindBy(how = How.NAME, using = "firstName")
	WebElement FirstName;
	
	@FindBy(name = "lastName")
	WebElement lastName;
	
	@FindBy(name = "phone")
	WebElement Phone;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\\\"userName\\\"]")
	WebElement email;
	
	@FindBy(name = "address1")
	WebElement address1;
	
	@FindBy(name = "address2")
	WebElement address2;
	
	@FindBy(name = "city")
	WebElement City;
	
	@FindBy(name = "state")
	WebElement State;
	
	@FindBy(name = "postalCode")
	WebElement PostalCode;
	
	@FindBy(name = "country")
	WebElement Country;
	
	@FindBy(name = "email")
	WebElement Email;
	
	@FindBy(name = "password")
	WebElement Password;
	
	@FindBy(name = "confirmPassword")
	WebElement Confirm;
	
	@FindBy(name = "register")
	WebElement Register;
	
	public RegPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);// Additional method need to add when we use findby annotation
	}

	public void clickRegLink() {
		RegLink.click();
	}

	public void setFirstName(String fName) {
		FirstName.sendKeys(fName);
	}

	public void setLastName(String lName) {
		lastName.sendKeys(lName);
	}

	public void setPhone(String phone) {
		Phone.sendKeys(phone);
	}

	public void setEmail(String email) {
		Email.sendKeys(email);
	}

	public void setAddress1(String address) {
		address1.sendKeys(address);
	}

	public void setAddress2(String address) {
		address2.sendKeys(address);
	}

	public void setCity(String city) {
		City.sendKeys(city);
	}

	public void setState(String state) {
		State.sendKeys(state);
	}

	public void setPostalCode(String postalcode) {
		PostalCode.sendKeys(postalcode);
	}

	public void setCountry(String country) {
		Country.sendKeys(country);
	}

	public void setUsername(String username) {
		Email.sendKeys(username);
	}

	public void setPassword(String password) {
		Password.sendKeys(password);
	}

	public void setConfirm(String confirm) {
		Confirm.sendKeys(confirm);
	}

	public void clickSubmit() {
		Register.click();
	}

	
}

