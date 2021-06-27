package com.test.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pom.classes.HomePage;
//import com.pom.classes.HomePage;
import com.pom.classes.LoginPage;

public class TestClass {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	private WebElement flipkartuser;
	SoftAssert soft;
	
	

@BeforeClass
public void beforeMethod() 
{	
	 System.setProperty("webdriver.chrome.driver", "C:\\IT Files\\Driver\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com");
	 
}	

@BeforeMethod
public void beforemethod() throws InterruptedException
{
	loginPage = new LoginPage(driver);

	loginPage.sendEmailID();
	loginPage.sendpassword();
	loginPage.loginbutton();	
	Thread.sleep(3000);
	loginPage.clickOnmobile();
}		
		
@Test
public void test1() throws InterruptedException
{
	homePage = new HomePage(driver);
	 System.out.println("purchase Iphone");
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	// Assert.assertEquals(url, "https://www.flipkart.co");
	 
	 soft = new SoftAssert();
	 soft.assertEquals(url, "https://www.flipkart.com");
	 homePage.clickOnSearchBox();
	 homePage.clickOnSearchicon();
	 Thread.sleep(5000);
	// homePage.clickOnIphone();
	 //Thread.sleep(5000);
	 //homePage.clickOnProceedToBuy();
	 Thread.sleep(3000);
	 homePage.clickOnFlipkartIcon();
	//homePage.clickOnShreyas();
	
	 
}

@AfterMethod
public void afterMethod() throws InterruptedException
{
	flipkartuser =driver.findElement(By.xpath("(//*[@class='_2gTTdy'])[1]"));
	Thread.sleep(5000);
	
	Actions a = new Actions (driver);
	a.moveToElement(flipkartuser).perform();
	Thread.sleep(5000);
	homePage.clickonLogout(); 	
	soft.assertAll();
}

@AfterClass ( timeOut = 10000)
public void afterClass() throws InterruptedException
{
	Thread.sleep(5000);
	driver.close();	
}
}