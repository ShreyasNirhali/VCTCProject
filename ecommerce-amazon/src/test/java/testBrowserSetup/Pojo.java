package testBrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Pojo {
	WebDriver driver;
	
	public static WebDriver openChromeBrowser()
	    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahi\\eclipse-workspace\\ecommerce-amazon\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		return driver;
		}
	
	public static WebDriver openOperaBrowser()
	    {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Mahi\\eclipse-workspace\\ecommerce-amazon\\browsers\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		return driver;
	    }

}
