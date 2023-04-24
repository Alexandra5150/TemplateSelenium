package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CartPage extends SeleniumWrappers {

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	public By qtyIncrease = By.xpath("//div[@class=\"quantity-button plus\"]");
	public By totalPrice = By.xpath("(//bdi[contains(text(), \"5.98\")])[5]");
	public By proceedToCheckOutButton = By.xpath("//a[contains(@class, \"checkout-button\")]");
	
	

}
