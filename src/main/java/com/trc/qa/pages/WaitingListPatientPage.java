package com.trc.qa.pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.trc.qa.base.TestBase;


import junit.framework.Assert;

public class WaitingListPatientPage  extends TestBase {
	
	
	@FindBy(id="Search")
	WebElement Searchbutton;

	
	
	@FindBy(id="txtSearchString")
	WebElement SearchWithname;
		
	@FindBy(xpath="//*[text()='nnie']")
	WebElement nnie;

	@FindBy(xpath="//*[text()='opher']")
	WebElement opher;
	
	
	public WaitingListPatientPage(){
		
		PageFactory.initElements(driver, this);
	}


	public void searchpatientWithName( ) throws InterruptedException  {
		
		
		
		SearchWithname.sendKeys("nnie");
		
		Searchbutton.click();
		
		
		Thread.sleep(2000);
		
	boolean flag =	nnie.isDisplayed();


	Assert.assertTrue(flag);
	}

public void searchpatientWithName1( ) throws InterruptedException  {
		
		
		
		SearchWithname.sendKeys("opher");
		
		Searchbutton.click();
		
		Thread.sleep(2000);
		
		
		
	boolean flag =	opher.isDisplayed();


	Assert.assertTrue(flag);

		
	}
	
	
}