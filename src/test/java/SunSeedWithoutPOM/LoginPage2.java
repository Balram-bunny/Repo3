package SunSeedWithoutPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	WebDriver driver;
	LoginPage2(WebDriver d)
	{
		driver =d;
		PageFactory.initElements(driver, this);
	}
	
	//Identify webElement
	@FindBy(name="email")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//span[contains(text(),'Sign in')]")
	WebElement loginbtn;
	
	public void enterusername(String uname)
	{
		username.sendKeys(uname);
	}
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickLoginbtn()
	{
		loginbtn.click();
	}

}
