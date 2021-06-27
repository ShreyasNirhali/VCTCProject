package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;

@FindBy (xpath ="(//*[@autocomplete='off'])[2]")
private WebElement email;

@FindBy (xpath="(//*[@autocomplete='off'])[3]")
private WebElement password;

@FindBy (xpath="(//*[@type='submit'])[2]")
private WebElement login;

@FindBy (xpath="(//*[@class='xtXmba'])[3]")
private WebElement mobile;


public LoginPage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void sendEmailID() 
{
  email.sendKeys("shreyes.nirhali@gmail.com");
}

public void sendpassword()
{
	password.sendKeys("shreyas221992");
}

public void loginbutton()
{
	login.click();
}


public void clickOnmobile()
{
	mobile.click();
}



}
