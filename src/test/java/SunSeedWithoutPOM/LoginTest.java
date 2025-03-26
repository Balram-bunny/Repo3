package SunSeedWithoutPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		LoginPage2 lg=new LoginPage2(driver);
		driver.get("https://thezaky.app/signin");
		lg.enterusername("shruthi.suresh+200@navyuginfo.com");
		lg.enterpassword("test@123");
		lg.clickLoginbtn();
	
        
	}

}
