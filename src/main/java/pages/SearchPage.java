package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.SeleniumWrappers;

public class SearchPage extends SeleniumWrappers {
	
	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	
	public By searchField = By.xpath("//input[@type=\"search\"]");
	public By pretzelBook = By.xpath("");
	
	
	
	public void searchField (String textToSearch) {		
		driver.findElement(searchField).sendKeys(textToSearch);
		driver.findElement(pretzelBook).click();
	}
	
	

}
