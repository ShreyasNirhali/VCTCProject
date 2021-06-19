package com.pom.classes;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;

	@FindBy (xpath="(//*[@style='visibility: visible;'])[2]")
	private WebElement login;
	
	@FindBy (xpath="//*[@id='ap_email']")
	private WebElement email;
	
	@FindBy (xpath="//*[@type='submit']")
	private WebElement continue1;
	
	@FindBy (xpath="//*[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//*[@class='a-button-input']")
	private WebElement continue2;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
		login.click();
	}
	
	public void sendemail()
	{
		email.sendKeys("shreyes.nirhali@gmail.com");
	}
	public void clickOnContinue()
	{
		continue1.click();
	}
	public void enterPassword()
	{
		password.sendKeys("India@123");
	}
	public void clickOnContinue2()
	{
		continue2.click();
	}
	
}
