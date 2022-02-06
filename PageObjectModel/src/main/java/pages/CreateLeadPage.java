package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
		
	}
	
	public CreateLeadPage verifyCreateLeadPage() {
		String title = driver.getTitle();
		String expected = "Create Lead | opentaps CRM";
		Assert.assertEquals(title, expected);
		return this;

	}
	
	public CreateLeadPage enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;

	}
	
	public CreateLeadPage enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	
	public CreateLeadPage enterPhone() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9052787001");
		return this;
	}
	
	public ViewLeadPage clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);

	}
	
	
	

}
