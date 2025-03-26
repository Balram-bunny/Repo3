package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	//constructor
	LoginPage(WebDriver d)
	{
		driver = d;
	}
	// Locating web element
   By username=By.id("user-name");
   By password=By.id("password");
   By loginbtn=By.id("login-button");
   // find web element
   public void enterusername(String uname)
   {
	   driver.findElement(username).sendKeys(uname);
   }
   public void enterpwd(String pwd)
   {
	   driver.findElement(password).sendKeys(pwd);
   }
   public void login()
   {
	   driver.findElement(loginbtn).click();
   }

}
