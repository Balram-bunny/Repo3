package Practice2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class session12_1 {
// capture a section of flipkart page
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//first we will find that section element .
		WebElement scrshot=driver.findElement(By.xpath("//span[text()='Login']"));
		//Call getsceenshotAs method to create image file
		File src=scrshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\user\\eclipse-workspace\\SeleniumPractice\\Screenshots\\flipkartsectionalimage.png");
		//copy image file to destination using apache-common io library
		FileUtils.copyFile(src, dest);
		driver.close();

	}

}
