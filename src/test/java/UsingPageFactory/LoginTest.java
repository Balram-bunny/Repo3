package UsingPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		LoginPage lg=new LoginPage(driver);
		lg.enterusername("standard_user");
		lg.enterpwd("secret_sauce");
		lg.loginn();
		

	}

}
