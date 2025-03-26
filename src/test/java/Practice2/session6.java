package Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class session6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		List<WebElement>linkelement=driver.findElements(By.tagName("a"));
		for(int i=0;i<linkelement.size();i++)
		{
			System.out.println(linkelement.get(i).getText());
		}
		
//		for(WebElement e:linkelement)
//		{
//			System.out.println(e.getText());
//		}
		System.out.println(linkelement.size());
		driver.close();
		

	}

}
