package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class LoginPage extends SeleniumWrappers {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public By username = By.id("username");
	public By password = By.id("password");
	public By loginButton = By.name("login");
	public By myAccountElement = By.xpath("//div[@class='woocommerce-MyAccount-content']");
	
	public void loginInApp (String user, String pass) {		
		//driver.findElement(username).sendKeys(user);
		sendKeys(username, user);
		sendKeys(password, pass);
		click(loginButton);
	}
	
//	public boolean elementIsDisplayed (By locator) {		
//		return driver.findElement(locator).isDisplayed();		
//	}
	
	

}
