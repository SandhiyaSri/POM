package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseClass;

public class HomePage extends BaseClass{

	public HomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")WebElement eleCRMSFA;
	public MyHomePage clickCRMSFA()
	{
		//driver.findElement(By.linkText("CRM/SFA")).click();
		eleCRMSFA.click();
		return new MyHomePage(driver);
	}
	public HomePage verifyHomePage()
	{
		//boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		boolean displayed = eleCRMSFA.isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
}
