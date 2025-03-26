package Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class session7 {

	public static void main(String[] args) {
		// TC 2- Open opencart app>> 1.select dropdown  2. check dropdown holds multiple options or not 3. get all options.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		//find dropdown field
		WebElement element=driver.findElement(By.xpath("//select"));
		Select dropdown=new Select(element);
		dropdown.selectByVisibleText("American Samoa");
//		dropdown.selectByIndex(1);
//		dropdown.selectByValue("DZA");
		if(dropdown.isMultiple())
		{
			System.out.println("dropdown is multiple");
		}
		else
		{
			System.out.println("dropdown is not multiple");
		}
		
		//List<WebElement> alloptions=driver.findElements(By.tagName("select"));
		List<WebElement> alloptions=dropdown.getOptions();

		for(WebElement el:alloptions)
		{
			System.out.println(el.getText());
		}
		driver.close();


	}

}
