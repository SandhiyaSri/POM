package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyDuplicateLead extends BaseClass{

	@Test
	public void runDuplicateLead() throws InterruptedException
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
		  .clickDuplicateLeadButton()
		  .clickCreateLeadButton();
	}
		  
}
