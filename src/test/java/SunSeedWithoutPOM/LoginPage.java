package SunSeedWithoutPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	LoginPage(WebDriver d)
	{
		driver =d;
	}
	//Locate elements
	By username=By.name("email");
	By password=By.name("password");
	By logbtn=By.xpath("//span[contains(text(),'Sign in')]");
	
	//Find web element
	public  void enterusername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	public void enterpwd(String pname)
	{
		driver.findElement(password).sendKeys(pname);
	}
	public void clickonbtn()
	{
		driver.findElement(logbtn).click();;
	}
}
