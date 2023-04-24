package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.SeleniumWrappers;

public class ProductPage extends SeleniumWrappers {

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	public By addToCartButton = By.xpath("//button[@type=\"submit\"]");
	public By addedToCartSuccess = By.xpath("//div[@class=\"woocommerce-message\"]");
	public By viewCartButton = By.xpath("(//a[contains(text(), \"View cart\")])[2]");
	
	
//	public boolean addedToCartSuccessIsDisplayed () {
//		return driver.findElement(addedToCartSuccess).isDisplayed();
//	}
	

}
