package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="username")WebElement eleUserName;
	@FindBy(how=How.ID,using="password")WebElement elePassword;
	
	public LoginPage enterUserName(String uName)
	{
		//driver.findElement(By.id("username")).sendKeys(uName);
		eleUserName.sendKeys(uName);
		return this;
	}
	
	public LoginPage enterPassword(String password)
	{
		//driver.findElement(By.id("password")).sendKeys(password);
		elePassword.sendKeys(password);
		return this;
	}
	
	public HomePage clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}

}
