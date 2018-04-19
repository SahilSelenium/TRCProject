package com.trc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.trc.qa.base.TestBase;

public class contactandtravelpage  extends TestBase{

	
	@FindBy(id="Layer_1")
    
	private WebElement logo;
	
    @FindBy(id="FirstName")
    
	private WebElement FirstName;
  
    
   
    
    @FindBy(id="LastName")
    
    private WebElement LastName;
   
    @FindBy(id="Email")
     
    private WebElement Email;
    
    
    @FindBy(id="Phone")
    
    private WebElement Phone;
    
    
 @FindBy(id="Message")
    
    private WebElement Message;
 
 
   
    @FindBy(xpath=" html/body/div[1]/div[2]/div/div/div/div[1]/div[2]/form/div/button")
    private WebElement savebutton;
    
    
   
   @FindBy(xpath="html/body/div[1]/div[3]/div[3]/div/div/div[3]//*[@id='FirstName']")
   
  	private WebElement downFirstName;
   
   @FindBy(xpath="html/body/div[1]/div[3]/div[3]/div/div/div[3]//*[@id='LastName']")
   
 	private WebElement downLastName;
   
   
   @FindBy(xpath="html/body/div[1]/div[3]/div[3]/div/div/div[3]//*[@id='Email']")
   
	private WebElement downEmail;
   
   @FindBy(xpath="html/body/div[1]/div[3]/div[3]/div/div/div[3]//*[@id='Phone']")
   
  	private WebElement downPhone;
   
   @FindBy(xpath="html/body/div[1]/div[3]/div[3]/div/div/div[3]//*[@id='Message']")
   
 	private WebElement downMessage;

   
   @FindBy(xpath="html/body/div[1]/div[3]/div[3]/div/div/div[3]/form/div/button")
   private WebElement downsavebutton;
   
   @FindBy(xpath="//*[contains(text(),'Health Disclaimers')]")
   private WebElement HealthDisclaimers;
   
   @FindBy(xpath="//*[contains(text(),'Privacy')]")
   private WebElement Privacy;
   
   @FindBy(xpath="//*[contains(text(),'Terms and Conditions')]")
   private WebElement TermsandConditions;
   
public contactandtravelpage(){
	
	PageFactory.initElements(driver, this);
}



public void Testlogo(){
	
	
Boolean flag =	logo.isDisplayed();
	
Assert.assertTrue(flag);
}



public void  Questionquery(){
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	downFirstName.sendKeys("Sam");
	downLastName.sendKeys("Richard");
	downEmail.sendKeys("sam@gmail.com");
	downPhone.sendKeys("9087678435");
	downMessage.sendKeys("Test for message Query");
	downsavebutton.click();
	
	
}

public void homepagetitle(){
	
	  
	    	
		   String title =    driver.getTitle();
		   
		   Assert.assertEquals(title, "Reversal Clinic | Home Page");
	
}

public void requestyouurfreeguide(){
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	FirstName.sendKeys("joseph");
	LastName.sendKeys("keen");
	Email.sendKeys("keen@gmail.com");
	Phone.sendKeys("9876786543");
	Message.sendKeys("test message");
	savebutton.click();
}

public void LinksDisplayed(){
	
boolean flag =	HealthDisclaimers.isDisplayed();
boolean flag1 = 	Privacy.isDisplayed();
boolean flag2 =	TermsandConditions.isDisplayed();

Assert.assertTrue(flag);
Assert.assertTrue(flag1);
Assert.assertTrue(flag2);
}



}
