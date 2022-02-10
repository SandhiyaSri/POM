package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class LeadsPage extends BaseClass {

	public static String leadID;

	public LeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}

	public LeadsPage clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return this;
	}

	public LeadsPage enterPhoneNumber() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("11111");
		return this;
	}

	public LeadsPage clickFindLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}

	public void checkForLeadsRecord() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

	}

	public ViewLeadPage clickFirstLead() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
	}

	public LeadsPage enterLeadId() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}

}
