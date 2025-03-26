package Practice2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click on date
		WebElement el=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(el);
		driver.findElement(By.id("datepicker")).click();
		String expectedmonth="February";
		String expectedyear="2025";
		String expectedday="9";
		while(true)
		{
		String calendarmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//find and locate feb month
		String calendaryear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// find and locate year
		if(calendarmonth.equals(expectedmonth)&& calendaryear.equals(expectedyear))
		{
//			List<WebElement>dayslist=driver.findElements(By.xpath("//table/tbody/tr/td"));
//			for(WebElement e:dayslist)
//			{
//				String calendarday=e.getText();//find and locate days
//				if(calendarday.equals(expectedday))
//				{
//					e.click();
//					break;
//				}
//			}
			driver.findElement(By.xpath("//a[text()=' "+ expectedday +"']")).click();
			
			break;
		}
		else
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		}
		}

}
