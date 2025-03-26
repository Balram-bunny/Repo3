package UsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	LoginPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="user-name")
	WebElement username;
	@FindBy (id="password")
	WebElement pwd;
	@FindBy (id="login-button")
	WebElement login;
	
	public void enterusername(String uname)
	{
		username.sendKeys(uname);
	}
	public void enterpwd(String password)
	{
		pwd.sendKeys(password);
	}
	public void loginn()
	{
		login.click();
	}

}
