package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class DuplicateLead extends BaseClass {
	
	@Test
	
	public void runDuplicateLead() throws InterruptedException {
		
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.verifyHomePage()
		.clickCRMSFA()
		.verifyMyHomePage()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.enterPhoneNumber()
		.clickFindLeads()
		.clickLeadId()
		.verifyViewLeadPage()
		.clickDuplicateLead()
		.clickCreateLead()
		.verifyViewLeadPage();
		
	}

}
