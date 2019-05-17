package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//span[text()='Log In']") WebElement btnLoginInit;
	@FindBy(name="email") WebElement edtUserName;
	@FindBy(name="password") WebElement edtPassword;
	@FindBy(xpath="//div[text()='Login']") WebElement btnLogin;
	
	public void loginCRM(String UN, String PWD)
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		btnLoginInit.click();
		edtUserName.sendKeys(UN);
		edtPassword.sendKeys(PWD);
		btnLogin.click();
	}

}
