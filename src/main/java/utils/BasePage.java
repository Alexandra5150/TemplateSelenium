package utils;

import org.openqa.selenium.WebDriver;

import pages.BlogPage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.OrderReceivedPage;
import pages.PostPage;
import pages.ProductPage;
import pages.SearchPage;

public class BasePage extends SeleniumWrappers {

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public MenuPage menu =  new MenuPage(driver);
	public LoginPage login =  new LoginPage(driver);
	public SearchPage search =  new SearchPage(driver);
	public ProductPage product =  new ProductPage(driver);
	public CartPage cart =  new CartPage(driver);
	public CheckoutPage checkout =  new CheckoutPage(driver);
	public OrderReceivedPage orderReceieved =  new OrderReceivedPage(driver);
	public BlogPage blog =  new BlogPage(driver);
	public PostPage post =  new PostPage(driver);
	

}
