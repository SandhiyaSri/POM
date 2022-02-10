package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class EditPage extends BaseClass {

	public EditPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public EditPage updateCompanyName()
	{
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		return this;
	}
	public ViewLeadPage clickUpdateButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
