package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Curs18Exercitiu extends BaseTest{
	
	@Parameters({"user", "pass"})	
	@Test
	public void curs17Exercitiu2 (String user, String pass) {
		
		app.click(app.menu.loginLink);		
		app.login.loginInApp(user, pass);
		
		app.click(app.categories.allCategories);
		
		//app.waitForElementToBeVisible(app.categories.product1);
		
		app.click(app.categories.fruitsAndVegetables);
		app.click(app.categories.product1);
		app.click(app.product.addToWishlist);
		app.click(app.product.closeWishlistPopup);
		app.click(app.categories.allCategories);
		
		app.click(app.categories.breakfastAndDairy);
		app.click(app.categories.product2);
		app.click(app.product.addToWishlist);
		app.click(app.product.closeWishlistPopup);
		app.click(app.categories.allCategories);
		
		app.click(app.categories.biscuitsAndSnaks);
		app.click(app.categories.product3);
		app.click(app.product.addToWishlist);
		app.click(app.product.closeWishlistPopup);
		app.click(app.categories.allCategories);
		
		app.click(app.categories.beverages);
		app.click(app.categories.product4);
		app.click(app.product.addToWishlist);
		app.click(app.product.closeWishlistPopup);
		app.click(app.categories.allCategories);
		
		app.click(app.menu.wishlist);
		
//		assertTrue(app.wishlist.elementIsDisplayed(app.wishlist.wishlistProduct1));
//		assertTrue(app.wishlist.elementIsDisplayed(app.wishlist.wishlistProduct2));
//		assertTrue(app.wishlist.elementIsDisplayed(app.wishlist.wishlistProduct3));
//		assertTrue(app.wishlist.elementIsDisplayed(app.wishlist.wishlistProduct4));
//		
//		assertTrue(app.wishlist.elementIsDisplayed(app.wishlist.buyProductButton));
//		assertTrue(app.wishlist.elementIsDisplayed(app.wishlist.addToCartButton1));
//		assertTrue(app.wishlist.elementIsDisplayed(app.wishlist.addToCartButton2));
//		assertTrue(app.wishlist.elementIsDisplayed(app.wishlist.addToCartButton3));
		
        By[] elements = new By[8];
        elements[0] = app.wishlist.wishlistProduct1;
        elements[1] = app.wishlist.wishlistProduct2;
        elements[2] = app.wishlist.wishlistProduct3;
        elements[3] = app.wishlist.wishlistProduct4;
        elements[4] = app.wishlist.buyProductButton;
        elements[5] = app.wishlist.addToCartButton1;
        elements[6] = app.wishlist.addToCartButton2;
        elements[7] = app.wishlist.addToCartButton3;
        
        for(int i=0; i<elements.length; i++) {
        	assertTrue(app.wishlist.elementIsDisplayed(elements[i]));
        }
		
		app.click(app.wishlist.selectAll);
		
		app.click(app.wishlist.actionsDropdown);
		
		app.click(app.wishlist.actionsDropdownAddToCart);
		
		app.click(app.wishlist.applyActionButton);
		
		assertTrue(app.wishlist.elementIsDisplayed(app.wishlist.cartCountIcon));
		assertTrue(app.wishlist.elementIsDisplayed(app.wishlist.errorMessage));
		
	}

}
