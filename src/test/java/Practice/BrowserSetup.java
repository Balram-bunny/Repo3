package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	 WebDriverManager.chromedriver().setup();
	
         ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.quit();

	}

}
