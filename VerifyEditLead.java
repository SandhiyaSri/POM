package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyEditLead extends BaseClass {

	@Test
	public void runEditLead() throws InterruptedException
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
		  .clickEditButton()
		  .updateCompanyName()
		  .clickUpdateButton();
	}
}
