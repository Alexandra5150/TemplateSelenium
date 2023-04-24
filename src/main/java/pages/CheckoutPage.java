package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CheckoutPage extends SeleniumWrappers {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	public By placeOrderButton = By.xpath("//button[@id=\"place_order\"]");
	public By checkboxTerms = By.xpath("//input[@name=\"terms\"]");
	
	

}
