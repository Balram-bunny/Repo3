package Practice2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class session16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//first convert webdriver object to Takesscreenshot interface.
		TakesScreenshot scrshot=(TakesScreenshot) driver;
		//Call getsceenshotAs method to create image file
		File src=scrshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\user\\eclipse-workspace\\SeleniumPractice\\Screenshots\\flipkartfullimage.png");
		//copy image file to destination using apache-common io library
		FileUtils.copyFile(src, dest);
		driver.close();

	}

}
