package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	public ViewLeadPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	public ViewLeadPage verifyFirstName()
	{
		boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
	public LeadsPage clickDeleteButton()
	{
		driver.findElement(By.linkText("Delete")).click();
		return new LeadsPage(driver);
	}
	public CreateLeadPage clickDuplicateLeadButton()
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new CreateLeadPage(driver);
	}
	public EditPage clickEditButton()
	{
		driver.findElement(By.linkText("Edit")).click();
		return new EditPage(driver);
	}

}
