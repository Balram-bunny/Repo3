package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class softassert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		SoftAssert softverify=new SoftAssert();
		softverify.assertEquals(driver.getTitle(), "IRCTC Next Generation eTicketing System1");
		
		System.out.println("To check search button is displayed or not");
		
		 WebElement ele=driver.findElement(By.xpath("//button[@type='submit']"));
		 softverify.assertTrue(ele.isDisplayed());
		 System.out.println("Yes, it is displayed");
		 driver.close();

	}

}
