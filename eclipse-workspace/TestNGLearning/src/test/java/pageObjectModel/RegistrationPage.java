package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	WebDriver driver;
	By RegLink = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]");
	By FirstName = By.name("firstName");
	By LastName = By.name("lastName");
	By Phone = By.name("phone");
	By Email = By.xpath("//*[@id=\"userName\"]");
	By Address1 = By.name("address1");
	By Address2 = By.name("address2");
	By City = By.name("city");
	By State = By.name("state");
	By PostalCode = By.name("postalCode");
	By Country = By.name("country");
	By Username = By.name("email");
	By Password = By.name("password");
	By Confirm = By.name("confirmPassword");
	By Submit = By.name("register");
	
	public RegistrationPage(WebDriver d) {
		driver = d;
	}
	
	public void clickRegLink() {
		driver.findElement(RegLink).click();
	}
	
	public void setFirstName(String fName) {
		driver.findElement(FirstName).sendKeys(fName);
	}
	
	public void setLastName(String lName) {
		driver.findElement(LastName).sendKeys(lName);
	}
	public void setPhone(String phone) {
		driver.findElement(Phone).sendKeys(phone);
	}
	public void setEmail(String email) {
		driver.findElement(Email).sendKeys(email);
	}
	public void setAddress1(String address) {
		driver.findElement(Address1).sendKeys(address);
	}
	public void setAddress2(String address) {
		driver.findElement(Address2).sendKeys(address);
	}
	public void setCity(String city) {
		driver.findElement(City).sendKeys(city);
	}
	public void setState(String state) {
		driver.findElement(State).sendKeys(state);
	}
	public void setPostalCode(String postalcode) {
		driver.findElement(PostalCode).sendKeys(postalcode);
	}
	public void setCountry(String country) {
		driver.findElement(Country).sendKeys(country);
	}
	public void setUsername(String username) {
		driver.findElement(Username).sendKeys(username);
	}
	public void setPassword(String password) {
		driver.findElement(Password).sendKeys(password);
	}
	public void setConfirm(String confirm) {
		driver.findElement(Confirm).sendKeys(confirm);
	}
	public void clickSubmit() {
		driver.findElement(Submit).click();
	}
}