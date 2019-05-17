package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTestCRM  extends BaseClass
{
	
	@Test
	public void loginApp()
	{
		logger=extent.createTest("Login to CRM");
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting Application");		
		lp.loginCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		logger.pass("Login Success");
		
	}
	
}
