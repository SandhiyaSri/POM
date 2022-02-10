package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	@FindBys({
		@FindBy(how=How.ID,using="createLeadForm_firstName"),
		@FindBy(how=How.ID,using="createLeadForm_lastName"),
		@FindBy(how=How.ID,using="createLeadForm_companyName"),
		@FindBy(how=How.NAME,using="submitButton")
	})List<WebElement> eleCreateLead;
	
	
	public CreateLeadPage enterFirstName(String fName)
	{
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		eleCreateLead.get(0).sendKeys(fName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName)
	{
		//driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		eleCreateLead.get(1).sendKeys(lName);
		return this;
	}
	
	public CreateLeadPage enterCompanyName(String cName)
	{
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		eleCreateLead.get(2).sendKeys(cName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}

}
