package Zaky;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TeamCreation {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://thezaky.app/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[@role='button'][position()=1]")).click();
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("balram.nayak+001@navyuginfo.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test@123");
        
            driver.findElement(By.cssSelector("input[type='checkbox']")).click();
            driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
            driver.findElement(By.xpath("//div[contains(text(),'I want to create a new team')]")).click();
            driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
            driver.findElement(By.xpath("//input[@type='checkbox']")).click();
            driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
            //hOST-tEAM
            driver.findElement(By.name("host_name")).sendKeys("Navyuginfo");
            //TEAM NAME
            driver.findElement(By.name("team_name")).sendKeys("team-00981");
            WebElement ele=driver.findElement(By.xpath("//div[contains(text(),'Select one option')]"));
            ele.click();
            driver.findElement(By.xpath("//li[contains(text(),'Use my screen name')]")).click();
            driver.findElement(By.xpath("//span[contains(text(),'Upload')]")).click();
            //Select dropdown=new Select(ele);
            //dropdown.selectByVisibleText("Use my screen name");
            Robot rb=new Robot();
            rb.delay(2000);
            StringSelection ss=new StringSelection("C:\\Users\\navyug\\Desktop\\coach average.png");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_V);
            
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(KeyEvent.VK_V);
            
            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);
            
            driver.findElement(By.xpath("//span[contains(text(),'Save and Continue')]")).click();
            driver.findElement(By.name("team_description")).sendKeys("fljwefljwpoefmjpowmjefowpfjempwofjpowjfpowjpojfgp");
            driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
            //2nd page
            driver.findElement(By.xpath("//div[contains(text(),'Select all that apply')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//li[contains(.,'Delivery / C-Section / Operating Room')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//html")).click();
            driver.findElement(By.name("babies_in_team")).sendKeys("110");
            driver.findElement(By.name("bed_capacity")).sendKeys("55");
            driver.findElement(By.xpath("//div[contains(text(),'Select a number')]")).click();
            driver.findElement(By.xpath("//li[contains(text(),'2')]")).click();
            driver.findElement(By.xpath("//div[contains(text(),'Select an option')]")).click();
            
            driver.findElement(By.xpath("//li[contains(text(),'Different units of the same hospital/organization')]")).click();
            driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
            Thread.sleep(15000);
            driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();



	}

}
