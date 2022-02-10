package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
//import week5.day1.ReadExcel;
import pages.LoginPage;

public class BaseClass {
	public RemoteWebDriver driver;
	public String fileName;
	
	@BeforeMethod
	public void preCondition() throws IOException
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();	
	}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException
	{
		
		return utlis.ReadExcel.readExcel(fileName);
	}

}
