package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.BaseTest;

public class LoginTest extends BaseTest{
	
	@Parameters({"user", "pass"})	
	@Test
	public void validLoginTest(String user, String pass) {
		
		app.click(app.menu.loginLink);		
		//app.menu.click(app.menu.loginLink);
		
//		app.sendKeys(app.login.username, "blabla");
//		app.sendKeys(app.login.password, "blabla2");
//		app.click(app.login.loginButton);
		
		app.login.loginInApp(user, pass);
		
	}

}
