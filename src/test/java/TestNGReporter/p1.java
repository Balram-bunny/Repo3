package TestNGReporter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p1 {
	@Test
	public void googlesearch()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Reporter.log("Chrome opened");
		driver.get("https://www.google.com/");
		Reporter.log("Enter Text");

		WebElement searchbox=driver.findElement(By.name("q"));
		Reporter.log("Enter Puri jagannath temple");

		searchbox.sendKeys("Puri Jagannath");
		Reporter.log("Press Enter");

		searchbox.sendKeys(Keys.ENTER);
		Reporter.log("Close chrome");
		driver.close();

		
	}

}
