package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Curs17Exercitiu1 extends BaseTest {
	
	
	@Parameters({"user", "pass"})	
	@Test
	public void curs17Exercitiu2 (String user, String pass) {
		
		app.click(app.menu.loginLink);		
		app.login.loginInApp(user, pass);
		
//		Actions action = new Actions(driver);
//		action
//			.moveToElement(app.search.searchField)
//			.sendKeys(app.search.searchField, "pretzel")
//			.sendKeys(Keys.ENTER)			
//			.perform();
		
		//app.sendKeys(app.search.searchField, "pretzel");
		app.search.searchField("pretzel");
		
		app.click(app.search.pretzelBook);
		
		app.click(app.product.addToCartButton);
		
		assertTrue(app.product.somethingIsDisplayed(app.product.addedToCartSuccess));
		//assertTrue(app.product.addedToCartSuccess.getText().contains("“Rold Gold Tiny Twists Pretzels” has been added to your cart."));
		
		app.click(app.product.viewCartButton);
		
		app.click(app.cart.qtyIncrease);
		
		assertTrue(app.cart.somethingIsDisplayed(app.cart.totalPrice));
		//assertEquals(driver.get(), "5.98");
		//assertTrue(app.cart.totalPrice.getText().contains("5.98"));
		
		app.click(app.cart.proceedToCheckOutButton);
		
		app.click(app.checkout.checkboxTerms);
		//assertTrue(app.checkout.checkboxTerms.isSelected());
		
		app.click(app.checkout.placeOrderButton);
		
		assertTrue(app.orderReceieved.somethingIsDisplayed(app.orderReceieved.orderRecievedSuccess));
		
		assertTrue(app.orderReceieved.somethingIsDisplayed(app.orderReceieved.orderNumber));
		
	}
	

}
