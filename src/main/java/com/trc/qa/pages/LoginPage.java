package com.trc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trc.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	// Page factory
	//page object repository
	
	@FindBy(id="Username")
	private WebElement usreNAmEdt;
	
	@FindBy(id="Password")
	private WebElement pswEdt;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn;
	
	@FindBy(id="Layer_1")
	private WebElement imglogo;
	
	
//	Intializing the page objects
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver,this);//this means current class object
		
		
	}
//Actions
	public String validateLoginpageTitle(){
		
		return driver.getTitle();
	}
	
	
	public boolean validateTRCImage(){
		
	return	imglogo.isDisplayed();
	}
	
	public HomePage Login(String usrename , String pswd){
		
		usreNAmEdt.sendKeys(usrename);
		pswEdt.sendKeys(pswd);
		loginBtn.click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
