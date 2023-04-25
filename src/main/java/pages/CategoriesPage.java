package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CategoriesPage extends SeleniumWrappers {

	public CategoriesPage(WebDriver driver) {
		super(driver);
	}
	
	public By fruitsAndVegetables = By.cssSelector("ul[id=\"menu-sidebar-menu\"] a[href=\"https://keyfood.ro/product-category/fruits-vegetables/\"]");
	public By breakfastAndDairy = By.cssSelector("ul[id=\"menu-sidebar-menu\"] a[href=\"https://keyfood.ro/product-category/breakfast-dairy/\"]");
	public By biscuitsAndSnaks = By.cssSelector("ul[id=\"menu-sidebar-menu\"] a[href=\"https://keyfood.ro/product-category/biscuits-snacks/\"]");
	public By beverages = By.cssSelector("ul[id=\"menu-sidebar-menu\"] a[href=\"https://keyfood.ro/product-category/beverages/\"]");
	public By product1 = By.cssSelector("a[href=\"https://keyfood.ro/product/fresh-produce-melons-each/\"]");
	public By product2 = By.cssSelector("a[href=\"https://keyfood.ro/product/vital-farms-pasture-raised-egg-bites-bacon-cheddar/\"]");
	public By product3 = By.cssSelector("a[href=\"https://keyfood.ro/product/shimmer-pastel-almond-blend/\"]");
	public By product4 = By.cssSelector("a[href=\"https://keyfood.ro/product/zevia-kidz-strawberry-lemonade-zero-calorie-soda/\"]");
	public By allCategories = By.cssSelector("a[data-toggle=\"collapse\"]");
	
	

}
