package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class session15 {

	public static void main(String[] args) {
		// how to handle tool tip info
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String actualtool=driver.findElement(By.xpath("//textarea[@name='q']")).getAttribute("aria-label");
        String excepted="Search";
        if(actualtool.equals(excepted))
        {
        	System.out.println("test passed");
        }
        else
        {
        	System.out.println("failed");
        }
         
        System.out.println("------------------------------");
        driver.get("https://practice.expandtesting.com/tooltips");
        WebElement ele=driver.findElement(By.xpath("//button[text()='Tooltip on top']"));
        Actions act=new Actions(driver);
        act.moveToElement(ele).perform();
	}

}
