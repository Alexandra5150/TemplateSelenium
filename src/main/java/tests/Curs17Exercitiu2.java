package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;


public class Curs17Exercitiu2 extends BaseTest {
	
	@Parameters({"browser", "appUrl"})
	@Test
	public void curs17Exercitiu2 (String browser, String appUrl) {
		
		app.click(app.menu.blogLink);
		
		assertTrue(app.blog.somethingIsDisplayed(app.blog.blogPost1));
		assertTrue(app.blog.somethingIsDisplayed(app.blog.blogPost2));
		assertTrue(app.blog.somethingIsDisplayed(app.blog.blogPost3));
		assertTrue(app.blog.somethingIsDisplayed(app.blog.blogPost4));
		
//		app.click(app.blog.blogPost1);
//		app.click(app.blog.blogPost2);
//		app.click(app.blog.blogPost3);
//		app.click(app.blog.blogPost4);
		
        By[] blogPost = new By[4];
        blogPost[0] = app.blog.blogPost1;
        blogPost[1] = app.blog.blogPost2;
        blogPost[2] = app.blog.blogPost3;
        blogPost[3] = app.blog.blogPost4;
       
        String[] expectedURLS = new String[4];
        expectedURLS[0] = "https://keyfood.ro/2021/05/03/but-i-must-explain-to-you-how-all-this-mistaken-idea/";
        expectedURLS[1] = "https://keyfood.ro/2021/05/03/the-problem-with-typefaces-on-the-web/";
        expectedURLS[2] = "https://keyfood.ro/2021/05/02/english-breakfast-tea-with-tasty-donut-desserts/";
        expectedURLS[3] = "https://keyfood.ro/2021/05/01/on-the-other-hand-we-provide-denounce-with-righteous/";

       
        for(int i=0; i<blogPost.length; i++) {
           
            app.blog.click(blogPost[i]);

//            List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
//            driver.switchTo().window(browserTabs.get(1));
            
            assertEquals(driver.getCurrentUrl(),expectedURLS[i]);
          
//    		Actions action = new Actions(driver);
//    		action
//    			.moveToElement(app.post.comment)
//    			.sendKeys(app.post.comment, "text text text")
//    			.sendKeys(Keys.TAB, "abc")
//    			.sendKeys(Keys.TAB, "abc@abc.com")
//    			.sendKeys(Keys.TAB, "https://abc.abc")
//    			.click(app.post.postCommentButton)			
//    			.perform();
            
    		assertTrue(app.post.somethingIsDisplayed(app.post.postAwaitingModeration));
    		
            app.click(app.menu.blogLink); 

            //driver.switchTo().window(browserTabs.get(0));
            
            
            
        }
		
		
		
	}
	

}
