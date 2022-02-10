package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class VerifyDeleteLead extends BaseClass {

	@Test
	public void runDeleteLead() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		//new LoginPage(driver)
		lp
		.enterUserName("DemoSalesManager")
		  .enterPassword("crmsfa")
		  .clickLogin()
		  .verifyHomePage()
		  .clickCRMSFA()
		  .clickLeadsLink()  
		  .clickFindLeads()
		  .enterPhoneNumber()
		  .clickFindLeadsButton()
		  .clickFirstLead()
		  .clickDeleteButton()
		  .clickFindLeads()
		  .enterLeadId()
		  .clickFindLeadsButton()
		  .checkForLeadsRecord();
		  
		  
	}
}
