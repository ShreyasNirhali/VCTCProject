package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

private WebDriver driver;

	
	@FindBy (xpath="//*[@title='Search for products, brands and more']")
	private WebElement searchbox;
	
	@FindBy (xpath="(//*[@viewBox='0 0 17 18'])[1]")
	private WebElement searchicon;
	
	@FindBy (xpath ="(//*[@class='_4rR01T'])[1]")
	private WebElement iphone;
	
	@FindBy (xpath="(//*[@class='col col-6-12'])[2]")
	private WebElement proceedtobuy;
	
	@FindBy (xpath ="(//*[@title='Flipkart'])[1]")
	private WebElement flipkarticon;
	
	@FindBy (xpath ="(//*[@class='exehdJ'])[1]")
	private WebElement shreyas;
	
	@FindBy (xpath ="(//div[@class='_3vhnxf'])[10]")
	private WebElement logout;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSearchBox()
	{
		searchbox.click();
		searchbox.sendKeys("iphone 12 pro max");
	}
	
	public void clickOnSearchicon()
	{
		searchicon.click();
	}
	
	public void clickOnIphone()
	{
		iphone.click();
	}
	
	public void clickOnProceedToBuy()
	{
		proceedtobuy.click();
	}
	public void clickOnFlipkartIcon()
	{
		flipkarticon.click();
	}
	public void clickOnShreyas()
	{
		shreyas.click();
	}
	
	public void clickonLogout()
	{
		logout.click();
	}
}
