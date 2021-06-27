package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;
	
	@FindBy (xpath="//div[text()='Tasks']")
	private WebElement taskLink;
	
	@FindBy (xpath="//div[text()='Reports']")
	private WebElement reportButton;
	
	@FindBy (xpath="//div[text()='Users']")
	private WebElement userButton;
	
	@FindBy (xpath="//a[@class='logout']")
	private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnTask()
	{
		taskLink.click();
	}
	public void clickONReport()
	{
		reportButton.click();
	}
	
	public void clickOnUser()
	{
		userButton.click();
	}
	
	public void clickOnLogOut()
	{
		logout.click();
	}
	
}
