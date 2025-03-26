package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p1 {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		TakesScreenshot scr = ((TakesScreenshot) driver);
		File srcFile = scr.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\user\\eclipse-workspace\\SeleniumPractice\\Screenshots\\image2.png");
		FileUtils.copyFile(srcFile, dest);
		driver.quit();
		

	}

}
