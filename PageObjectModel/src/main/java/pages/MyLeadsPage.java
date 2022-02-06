package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {

	public MyLeadsPage(RemoteWebDriver driver) {

		this.driver = driver;
	}

	public MyLeadsPage verifymyLeadsPage() {

		String title = driver.getTitle();
		String expected = "My Leads | opentaps CRM";
		Assert.assertEquals(title, expected);
		return this;

	}

}
