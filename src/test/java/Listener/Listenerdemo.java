package Listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
 //        packagename.class.class
@Listeners(Listener.Listenerclass.class)
public class Listenerdemo {
	WebDriver driver;
	@Test
public void testcasepassed()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	Assert.assertEquals(driver.getTitle(), "IRCTC Next Generation eTicketing System");
}
	@Test
	public void testfailed()
	{
		Assert.assertTrue(false);
	}
	@Test
	public void testskipped()
	{
		throw new SkipException("skip exception thrown..");
	}
	@AfterTest
	public void closewindow()
	{
		
		driver.close();
	}
}
