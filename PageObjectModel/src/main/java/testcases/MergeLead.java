package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class MergeLead extends BaseClass{

	@Test
	public void runMergeLead() throws InterruptedException {
		
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.verifyHomePage()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.selectFromLead()
		.selectToLead()
		.clickMerge()
		.verifyViewLeadPage();

	}
}
