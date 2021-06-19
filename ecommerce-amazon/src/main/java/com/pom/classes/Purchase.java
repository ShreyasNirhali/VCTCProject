package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchase {

	private WebDriver driver;
	
	@FindBy (xpath ="(//*[@class='nav-input nav-progressive-attribute'])[1]")
	private WebElement searchbox;
	
	@FindBy (xpath ="(//*[@class='nav-input nav-progressive-attribute'])[2]")
	private WebElement search;

	@FindBy (xpath ="(//*[@class='a-link-normal a-text-normal'])[2]")
	private WebElement racket1;
	
//	@FindBy (xpath ="//*[@id='nav-link-accountList']")
//	private WebElement log;
	
	@FindBy (xpath ="(//*[@class='nav-text'])[22]")
	private WebElement logout;
	
	public Purchase(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSearchbox ()
	{
		searchbox.sendKeys("HIT Anti Mosquito Racquet ");
	}
	
	public void clickOnSearch()
	{
		search.click();
	}
	public void clickOnRacket()
	{
		racket1.click();
	}
//	public void clickOnLog()
//	{
//		log.click();
//	}
	public void clickOnLogout()
	{
		logout.click();
	}
}
