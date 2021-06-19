package com.test.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
import com.pom.classes.Recharge;

import testBrowserSetup.Pojo;

public class TestClass2 extends Pojo{

	WebDriver driver;
	private LoginPage loginPage;
	private Purchase purchase;
	private Recharge recharge;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
public void  launchBrowser(String browser) {
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
	//	System.setProperty("webdriver.chrome.driver", "C:\\IT Files\\Driver\\chromedriver_win32\\chromedriver.exe");
	//	driver = new ChromeDriver();
	//	driver.manage().window().maximize();
	//	driver.get("https://www.amazon.in");
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
public void test11() throws InterruptedException
{
	recharge = new Recharge(driver);
	//Thread.sleep(7000);
	recharge.clickOnAmazonPay();
	recharge.clickOnMobileRecharge();
	recharge.clickOnMobileNumber();
	Thread.sleep(3000);
	recharge.clickOnViewPlan();
	
	Thread.sleep(3000);
	recharge.clickOnPlan199();
	recharge.clickOnContinueToPay();
	Thread.sleep(3000);
	recharge.clickOnAddCreditCard();
	recharge.clickOnAddCreditCard1();
	
	driver.switchTo().frame((driver.findElement(By.name("ApxSecureIframe"))));
//	recharge.clickOnCardNumber();
//	recharge.clickOnAddCreditCard2();
	
	
	
	
	
	
}









@AfterMethod
public void aftermethod() throws InterruptedException
{
	
	//      WebElement log =driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
	 //     Actions a = new Actions (driver);
	 //     a.moveToElement(log).perform();
	      
	     
	//Thread.sleep(3000);
	//purchase.clickOnLogout();
}

@AfterClass
public void afterclass()
{
   driver.quit();
}



}