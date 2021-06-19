package com.test.classes;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pom.classes.LoginPage;
import com.pom.classes.Purchase;

import testBrowserSetup.Pojo;
import utilities.utility;


public class TestClass extends Pojo {
	WebDriver driver;
	private LoginPage loginPage;
	private Purchase purchase;
	JavascriptExecutor js;
	WebElement racket;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	int testID;
	
	
@BeforeTest
@Parameters("browser")
public void launchBrowser(String browser) {
	reporter = new ExtentHtmlReporter("test-output//ExtendReport//Extent.html");
	ExtentReports extend = new ExtentReports();
	extend.attachReporter(reporter);
	
	System.out.println("Before Test");
	if(browser.equalsIgnoreCase("Chrome"))
	{
		driver = openChromeBrowser();
	}
	else if(browser.equalsIgnoreCase("Opera"))
	{
		driver = openOperaBrowser();
	}
}
	


@BeforeClass
public void beforeclass() throws InterruptedException
{
		//System.setProperty("webdriver.chrome.driver", "C:\\IT Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.amazon.in");		
}

@BeforeMethod
public void beforemethod() throws InterruptedException
{
	loginPage = new LoginPage(driver);
	Thread.sleep(3000);
	loginPage.login();
	loginPage.sendemail();
	loginPage.clickOnContinue();
	loginPage.enterPassword();
	loginPage.clickOnContinue2();
	
}

@Test
public void test1() throws InterruptedException 
{
	testID = 200;
	Thread.sleep(3000);
	purchase = new Purchase(driver);
	purchase.clickOnSearchbox();
	purchase.clickOnSearch();
	Thread.sleep(3000);
//	js = ((JavascriptExecutor)driver);
//	racket = driver.findElement(By.xpath("(//*([@class='a-size-base-plus a-color-base a-text-normal'])[2]"));
//	js.executeScript("argument[0].scrollIntoView(true);",racket);
	purchase.clickOnRacket();
	
	ArrayList<String> addr =new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
	
	driver.findElement(By.id("buy-now-button")).click();
	
	
	
	Thread.sleep(3000);
	 addr =new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(0));
	
	Thread.sleep(3000);
	

}
@AfterMethod
public void aftermethod(ITestResult result) throws InterruptedException, IOException{
	if(ITestResult.FAILURE == result.getStatus())
	{
		utility.takeScreenshot(driver,testID);
	}
	
	
	WebElement log =driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
	      Actions a = new Actions (driver);
	      a.moveToElement(log).perform();
	      
	     
	Thread.sleep(3000);
	purchase.clickOnLogout();
}

@AfterClass
public void afterclass()
{
   driver.quit();
}


}
