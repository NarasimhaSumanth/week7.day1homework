package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	
	public MyHomePage(RemoteWebDriver driver) {
		this.driver = driver;
		
	}
	
	public MyHomePage verifyMyHomePage() {
		String title = driver.getTitle();
	String	expected = "My Home | opentaps CRM";
Assert.assertEquals(title, expected);
return this;
	}
	
	public LeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);
	}
	
	
	
	

}
