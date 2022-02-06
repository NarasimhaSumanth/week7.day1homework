package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class DeleteLead extends BaseClass {

	@Test
	public void runDeleteLead() throws InterruptedException {
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
		.clickDelete()
		.verifymyLeadsPage();

	}
}
