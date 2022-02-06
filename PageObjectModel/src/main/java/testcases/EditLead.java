package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class EditLead extends BaseClass{
	
	@Test
public void runEditLead() throws InterruptedException {
	
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
		.clickEdit()
		.updatecompanyName()
		.clickSubmitButton()
		.verifyViewLeadPage();

}
}
