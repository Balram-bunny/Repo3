package Calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Expectedmonth="August";
		String Expectedyear="2025";
		String Expectedday="10";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
         while(true)
		{
			String Actualmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String Actualyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(Expectedmonth.equals(Actualmonth)&& Expectedyear.equals(Actualyear))
			{
				List<WebElement> daylist=driver.findElements(By.xpath("//table/tbody/tr/td"));
				for(WebElement a:daylist)
				{
					String calendarday=a.getText();
					if(calendarday.equals(Expectedday))
					{
						a.click();
						break;
					}
				}
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		

	}
	

}
