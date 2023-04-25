package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class WishlistPage extends SeleniumWrappers {

	public WishlistPage(WebDriver driver) {
		super(driver);
	}
	
	
	public By wishlistProduct1 = By.xpath("//td[@class=\"product-name\"]/a[contains(text(), \"Zevia Kidz Strawberry Lemonade Zero Calorie Soda\")]");
	public By wishlistProduct2 = By.xpath("//td[@class=\"product-name\"]/a[contains(text(), \"Shimmer Pastel Almond Blend\")]");
	public By wishlistProduct3 = By.xpath("//td[@class=\"product-name\"]/a[contains(text(), \"Vital Farms Pasture-Raised Egg Bites Bacon & Cheddar\")]");
	public By wishlistProduct4 = By.xpath("//td[@class=\"product-name\"]/a[contains(text(), \"Fresh Produce Melons Each\")]");
	public By buyProductButton = By.cssSelector("button[title=\"Buy product\"]");
	public By addToCartButton1 = By.xpath("(//button[@title=\"Add to Cart\"])[1]");
	public By addToCartButton2 = By.xpath("(//button[@title=\"Add to Cart\"])[2]");
	public By addToCartButton3 = By.xpath("(//button[@title=\"Add to Cart\"])[3]");
	public By selectAll = By.cssSelector("input[class=\"global-cb\"]");
	public By actionsDropdown = By.cssSelector("select[id=\"tinvwl_product_actions\"]");
	public By actionsDropdownAddToCart = By.cssSelector("option[value=\"add_selected\"]");
	public By applyActionButton = By.cssSelector("button[class=\"button tinvwl-break-input tinvwl-break-checkbox\"]");
	public By cartCountIcon = By.xpath("//span[@class=\"cart-count-icon\" and contains(text(), \"3\")]");
	public By errorMessage = By.cssSelector("ul[class=\"woocommerce-error\"]");
	

}
