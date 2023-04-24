package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class PostPage extends SeleniumWrappers {

	public PostPage(WebDriver driver) {
		super(driver);
	}
	
	public By comment = By.xpath("//textarea[@id=\"comment\"]");
	public By postCommentButton = By.xpath("//input[@class=\"submit\"]");
	public By postAwaitingModeration = By.xpath("(//div[@class=\"klb-post\"])[5]/em");

}
