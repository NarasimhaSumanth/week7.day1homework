package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	
	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
		
	}

	public ViewLeadPage verifyViewLeadPage() {

		String title = driver.getTitle();
		String expected = "View Lead | opentaps CRM";
		Assert.assertEquals(title, expected);
		return this;
	}
	
	public ViewLeadPage clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
		return this;
	}

	public ViewLeadPage updatecompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		return this;
	}

	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return this;
	}
	
	public DuplicateLeadPage clickDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);

	}
	
	public MyLeadsPage clickDelete() {
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver);

	}

}
