package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class FindLeadsPage extends BaseClass {

	public FindLeadsPage(RemoteWebDriver driver) {

		this.driver = driver;

	}

	public FindLeadsPage clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		return this;
	}

	public FindLeadsPage enterPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9052");

		return this;

	}

	public FindLeadsPage clickFindLeads() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}

	public ViewLeadPage clickLeadId() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
	}

	
}
