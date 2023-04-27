package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Curs17Exercitiu1 extends BaseTest {
	
	
	@Parameters({"user", "pass"})	
	@Test
	public void curs17Exercitiu2 (String user, String pass) {
		
		app.click(app.menu.loginLink);		
		app.login.loginInApp(user, pass);
		
//		WebElement searchField = driver.findElement(app.search.searchField);
//		
//		Actions action = new Actions(driver);
//		action
//			.moveToElement(searchField)
//			.sendKeys(searchField, "pretzel")
//			.sendKeys(Keys.ENTER)			
//			.perform();
		
		//app.sendKeys(app.search.searchField, "pretzel");
		app.search.searchField("pretzel");
		
		//app.click(app.search.pretzelBook);
		
		app.click(app.product.addToCartButton);
		
		assertTrue(app.product.elementIsDisplayed(app.product.addedToCartSuccess));
		//assertTrue(app.product.addedToCartSuccess.getText().contains("“Rold Gold Tiny Twists Pretzels” has been added to your cart."));
		
		app.click(app.product.viewCartButton);
		
		app.click(app.cart.qtyIncrease);
		
		assertTrue(app.cart.elementIsDisplayed(app.cart.totalPrice));
		//assertEquals(driver.get(), "5.98");
		//assertTrue(app.cart.totalPrice.getText().contains("5.98"));
		
		app.click(app.cart.proceedToCheckOutButton);
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.stalenessOf(app.getElement(app.checkout.checkboxTerms) ));
		
		app.click(app.checkout.checkboxTerms);
		assertTrue(app.getElement(app.checkout.checkboxTerms).isSelected());
		
		app.click(app.checkout.placeOrderButton);
		
		assertTrue(app.orderReceieved.elementIsDisplayed(app.orderReceieved.orderRecievedSuccess));
		
		assertTrue(app.orderReceieved.elementIsDisplayed(app.orderReceieved.orderNumber));
		
	}
	

}
