package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.ID, using="username") WebElement eleUserName;
	
	
	public LoginPage enterUsername() {
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		eleUserName.sendKeys("Demosalesmanager");
		return this;

	}
	
	@FindBy(how = How.ID, using="password") WebElement elepassword;
	
	public LoginPage enterPassword() {
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		elepassword.sendKeys("crmsfa");
		return this;
	}
	
	
	@FindBy(how = How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogin;
	public HomePage clickLogin() {
	//	driver.findElement(By.className("decorativeSubmit")).click();
		eleLogin.click();
	
		return new HomePage(driver);
	}

}
