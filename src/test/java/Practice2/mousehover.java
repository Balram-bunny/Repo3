package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=CjwKCAiAtNK8BhBBEiwA8wVt99Lg8Opvz9bU5WxhAnXUlosMaEJns4W5vlL47YcgM_dBQsBTnqR84xoCuzEQAvD_BwE");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.linkText("Beauty"));
		Thread.sleep(2000);
System.out.println("kjhjkkhj");
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		System.out.println("kjhjkkhj");


	}

}
