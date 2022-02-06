package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class DuplicateLeadPage extends BaseClass {
	
	public DuplicateLeadPage(RemoteWebDriver driver) {
		
		this.driver = driver;
	}
	
	public ViewLeadPage clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);

	}

}
