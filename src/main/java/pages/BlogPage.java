package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BlogPage extends SeleniumWrappers {

	public BlogPage(WebDriver driver) {
		super(driver);
	}
	
	public By blogPost1 = By.xpath("(//div[@class=\"site-posts\"]/descendant::h2[@class=\"entry-title\"])[1]");
	public By blogPost2 = By.xpath("(//div[@class=\"site-posts\"]/descendant::h2[@class=\"entry-title\"])[2]");
	public By blogPost3 = By.xpath("(//div[@class=\"site-posts\"]/descendant::h2[@class=\"entry-title\"])[3]");
	public By blogPost4 = By.xpath("(//div[@class=\"site-posts\"]/descendant::h2[@class=\"entry-title\"])[4]");
	

}
