package Zaky;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

	public static void main(String[] args) {
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
            driver.findElement(By.xpath("//div[text()='Select your preferred pronoun']")).click();
           List<WebElement>ele =driver.findElements(By.xpath("//li[@role='option']"));
           WebElement ele2 = driver.findElement(By.xpath("//li[@role='option']"));
           Select s=new Select(ele2);
           s.selectByVisibleText("Feb");
//           for(int i=0;i<ele.size();i++)
//           {
//        	   String drop = ele.get(i).getText();
//        	   System.out.println(drop);
//        	   if(drop.equalsIgnoreCase("He / Him / His"))
//        	   {
//        		   ele.get(i).click();
//        	   }
           }

	}


