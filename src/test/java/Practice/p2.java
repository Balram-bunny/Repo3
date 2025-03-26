package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class p2 {
	public void m1() throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	TakesScreenshot scr = ((TakesScreenshot) driver);
	File srcFile = scr.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\user\\eclipse-workspace\\SeleniumPractice\\Screenshots\\image3.png");
	FileUtils.copyFile(srcFile, dest);
	driver.quit();
}
}
