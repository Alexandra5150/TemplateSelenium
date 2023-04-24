package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class OrderReceivedPage extends SeleniumWrappers {

	public OrderReceivedPage(WebDriver driver) {
		super(driver);
	}
	
	public By orderRecievedSuccess = By.xpath("//p[contains(@class, \"success woocommerce\")]");
	public By orderNumber = By.xpath("//li[@class=\"woocommerce-order-overview__order order\"]");

}
