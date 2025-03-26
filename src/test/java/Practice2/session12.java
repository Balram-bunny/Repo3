package Practice2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class session12 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// Upload files using Robot class
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/upload#google_vignette");
		WebElement ele=driver.findElement(By.name("file"));
		//1.Peform click operation on choose file
		Actions act=new Actions(driver);
		act.contextClick(ele).click().perform();
		Thread.sleep(2000);
		//2. copy the path of file in clipboard using string selction class
		StringSelection ss=new StringSelection("C:\\Users\\user\\Untitled-1.txt");
		//copy the file
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//paste the file we basically use robot class for keyword operation
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);//keypress control+V
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);//keyrelease control+V
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.xpath("//button[text()='Upload']"));
		act.moveToElement(ele2).click().perform();
		
		

	}

}
