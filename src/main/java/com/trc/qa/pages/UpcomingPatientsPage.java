package com.trc.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.util.TestUtil;

import junit.framework.Assert;

public class UpcomingPatientsPage extends TestBase {
	TestUtil Tets = new TestUtil();
	
	@FindBy(xpath="//*[text()='Upcoming Patients']")
	WebElement PatientList;

	@FindBy(xpath="//*[@class='k-button k-button-icontext k-grid-pdf']")
	WebElement Downloadpdf;
		
	

	public UpcomingPatientsPage(){
		
		PageFactory.initElements(driver, this);
	}


	public void upcomingpatient(){
//		Tets.waitforElementPresent(PatientList);
//    boolean flag =PatientList.isDisplayed();
		
		
	}
		
	public void downloadPDF() throws InterruptedException, AWTException{
		
		Downloadpdf.click();
		
		Thread.sleep(4000);
		  Robot robot = new Robot();  // Robot class throws AWT Exception	
	    Thread.sleep(2000); // Thread.sleep throws InterruptedException	
	    robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
	    
	    Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
	    robot.keyPress(KeyEvent.VK_TAB);	
	    Thread.sleep(2000);	
	    robot.keyPress(KeyEvent.VK_TAB);	
	    Thread.sleep(2000);	
	    robot.keyPress(KeyEvent.VK_TAB);	
	    Thread.sleep(2000);	
	    robot.keyPress(KeyEvent.VK_ENTER);	
	 	
	 }	 
		  
	
}

