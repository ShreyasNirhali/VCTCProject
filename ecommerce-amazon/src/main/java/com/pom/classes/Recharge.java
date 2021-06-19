package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recharge {

	private WebDriver driver;
	
	@FindBy (xpath="//a[normalize-space()='Amazon Pay']")
	private WebElement amazonpay;
	
	
	@FindBy (xpath="//*[text()='Mobile Recharge']")
	private WebElement mobilerecharge;
	
	@FindBy (xpath="//input[@id='mobileNumberTextInputId']")
	private WebElement mobilenumber;
	
	
	@FindBy (xpath="//*[@id='viewPlanTriggerId']")
	private WebElement viewplan;
	
	
	@FindBy (xpath="//input[@value='Recommended~199~NA~28 Days~1008395~KOMPARIFY']")
	private WebElement plan199;
	
	@FindBy (xpath="//span[@id='payButtonText']")
	private WebElement continuetopay;
	
	@FindBy (xpath="//input[@value='SelectableAddCreditCard']")
	private WebElement addcreditcard;
	
	@FindBy (xpath="//*[@class='a-link-emphasis pmts-add-cc-default-trigger-link']")
	private WebElement addcreditcard1;
	
	@FindBy (xpath="//*[@class='a-input-text a-form-normal']")
	private WebElement cardnumber;
	
	@FindBy (xpath="//*[@class='a-button-input']")
	private WebElement addyourcreditcard2; 
	
	public Recharge(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickOnAmazonPay()
	{
		amazonpay.click();
	}
	
	public void clickOnMobileRecharge()
	{
		mobilerecharge.click();
	}
	
	public void clickOnMobileNumber()
	{
		mobilenumber.sendKeys("8999075617");
	}
	
	public void clickOnViewPlan()
	{
		viewplan.click();
	}
	
	public void clickOnPlan199()
	{
	    plan199.click();	
	}
	
	public void clickOnContinueToPay()
	{
		continuetopay.click();
	}
	
	public void clickOnAddCreditCard()
	{
		addcreditcard.click();
	}
	public void clickOnAddCreditCard1()
	{
		addcreditcard1.click();
	}
	
	public void clickOnCardNumber()
	{
		cardnumber.sendKeys("123456789101");
    }
	
	public void clickOnAddCreditCard2()
	{
		addyourcreditcard2.click();
	}
}
