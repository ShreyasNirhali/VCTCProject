package com.test.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.classes.HomePage;
import com.pom.classes.LoginPage;

public class TestClass {

	  private WebDriver driver;
	  private LoginPage loginPage;
	  private HomePage homePage;
	
		
@BeforeClass
public void beforeclass()
{
		System.setProperty("webdriver.chrome.driver", "C:\\IT Files\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://localhost/login.do");
}		
		
@BeforeMethod
public void beforeMethod() throws InterruptedException
{
	    
	     loginPage = new LoginPage(driver);
	     Thread.sleep(5000);
	     loginPage.sendusername();
	     loginPage.sendpassword();
	     loginPage.clickOnLoginButton();
}

@Test
public void verifyTaskLink() throws InterruptedException
{
	     System.out.println("Verify Task Button");
	     homePage = new HomePage(driver);
	     Thread.sleep(3000);
	     homePage.clickOnTask();
	     String url = driver.getCurrentUrl();
	     
	     if(url.equals("http://localhost/tasks/otasklist.do"))
	     {
	    	 System.out.println("PASS");
	     }
	     else {
	    	 System.out.println("FAIL");
	     }
}

@Test
public void verifyReportLink() throws InterruptedException
{
	Thread.sleep(5000);
	System.out.println("Verify Report button");
	homePage = new HomePage(driver);
	Thread.sleep(3000);
	homePage.clickONReport();
	String url = driver.getCurrentUrl();
	
	if(url.equals("http://localhost/reports/reports.do"))
    {
   	 System.out.println("PASS");
    }
    else {
   	 System.out.println("FAIL");
    }
}

@Test
public void verifyUserLink() throws InterruptedException
{
     Thread.sleep(5000);
     System.out.println("Verify User button");
     homePage = new HomePage(driver);
     Thread.sleep(3000);
     homePage.clickOnUser();
     String url = driver.getCurrentUrl();
     
     if(url.equals("http://localhost/administration/userlist.do"))
     {
    	 System.out.println("PASS");
     }
     else {
    	 System.out.println("FAIL");
     }
}	

@AfterMethod
public void afterMethod() throws InterruptedException
{
     	Thread.sleep(3000);
     	homePage.clickOnLogOut();
     	Thread.sleep(3000);
}

@AfterClass
public void afterClass()
{
	driver.close();
	
}
}










