package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Login extends BaseClass{
	
	@Test
	public void verifyLogin() {
		
		new LoginPage(driver).enterUsername().enterPassword().clickLogin()
		.verifyHomePage();
		

	}

}
