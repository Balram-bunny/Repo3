package Practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class session17 {

	public static void main(String[] args) {
		// how to open new tab/window
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//first window
		System.out.println("first title :"+driver.getTitle());
		//new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("second title :"+driver.getTitle());
		driver.close();

		
		Set<String>windowhandles=driver.getWindowHandles();// this we did for navigate to first window
		List<String>handles=new ArrayList<String>();
		handles.addAll(windowhandles);
		
		driver.switchTo().window(handles.get(0));
		System.out.println("first title :"+driver.getTitle());
		driver.close();

		

	}

}
