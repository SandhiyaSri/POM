package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass {
	@BeforeTest
	public void setUp()
	{
		fileName="CreateLead";
	}
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String cName,String fName,String lName)
	{
		new LoginPage(driver)
		.enterUserName("DemoSalesManager")
		  .enterPassword("crmsfa")
		  .clickLogin()
		  .verifyHomePage()
		  .clickCRMSFA()
		  .clickLeadsLink()
		  .clickCreateLead()
		  .enterCompanyName(cName)
		  .enterFirstName(fName)
		  .enterLastName(lName)
		  .clickCreateLeadButton()
		  .verifyFirstName();
	}

}
