package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath="//*[@id='username']")
	private WebElement username;
	
	@FindBy (xpath="(//*[@type='password'])[1]")
	private WebElement password;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement login;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername() 
	{
	  username.sendKeys("admin");
	}
	
	public void sendpassword()
	{
		password.sendKeys("manager");
	}
	
	public void clickOnLoginButton() 
	{
		login.click();
	}
}
