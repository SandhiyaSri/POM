package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	public MyHomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	public LeadsPage clickLeadsLink()
	{
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);
	}
	

}
