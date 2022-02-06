package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Excel;

public class BaseClass {
	public String fileName;
	public  RemoteWebDriver driver;
	

	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@AfterMethod
	public void postCondition() {
	driver.close();

	}
	@DataProvider (name = "fetchData")
	 public String[][] sendData() throws IOException{
		 return Excel.readData(fileName);
		 
	 }
}
