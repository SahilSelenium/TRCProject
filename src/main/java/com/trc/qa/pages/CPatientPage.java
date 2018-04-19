
package com.trc.qa.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.trc.qa.base.TestBase;
import com.trc.qa.util.TestUtil;

public class CPatientPage extends TestBase {

	
	TestUtil test = new TestUtil();
	
@FindBy(id="btnNewPracticePatient")
WebElement ADDnewPatient;



@FindBy(id="FirstName")
WebElement FirstNam;

@FindBy(id="LastName")
WebElement LastNam;

@FindBy(id="YearSinceVesectomy")
WebElement YearSinceVesectom;
	
@FindBy(id="Age")
WebElement Age;

@FindBy(id="Email")
WebElement Email;


@FindBy(id="Phone")
WebElement Phone;


@FindBy(id="BAdd1")
WebElement Address1;


@FindBy(id="BAdd2")
WebElement Address2;


@FindBy(id="BCity")
WebElement City;


@FindBy(id="BZip")
WebElement ZipCode;

@FindBy(id="btnAddPatient")
WebElement Savebutton;

@FindBy(id="btnClose")
WebElement Closebtn;

@FindBy(xpath="//*[text()='Patient List']")
WebElement Patient;



@FindBy(xpath="//*[@class='k-button k-button-icontext k-grid-pdf']")
WebElement Downloadpdf;
	
@FindBy(id="txtStartDate")
WebElement StartDate;

@FindBy(id="txtEndDate")
WebElement EndDate;

@FindBy(id="btnSearch")
WebElement Searchbutton;

@FindBy(id="txtSearchString")
WebElement SearchWithname;

@FindBy(xpath="//*[text()='Joey']")
WebElement Joey;



public CPatientPage(){
	
	PageFactory.initElements(driver, this);
}

public void searchpatient(String Startdate,String Enddate ){
	
	StartDate.sendKeys(Startdate);
	EndDate.sendKeys(Enddate);
	Searchbutton.click();
}
public void searchpatientWithEMail( ) throws InterruptedException{
	
	SearchWithname.sendKeys("chloejean3351@gmail.com");
	       
	Searchbutton.click();
	Thread.sleep(3000);
	test.waitforElementPresent(Joey);
	
boolean flag =	Joey.isDisplayed();
System.out.println(flag);
Assert.assertTrue(flag);
	
	
}
public void searchpatientWithName( ) throws InterruptedException{
	
	SearchWithname.sendKeys("Joey");
	       
	Searchbutton.click();
	Thread.sleep(3000);
	test.waitforElementPresent(Joey);

boolean flag =	Joey.isDisplayed();
System.out.println(flag);

Assert.assertTrue(flag);
	
	
}

public void CreateNewPatient( String title ,String ftName, String ltName, String YearSincev,String Agge ,String Emailid,String Phonenumber,String Address,String Addresssecond,String CityName, 
		
		String Zip , String countryId ,String StateId ,String ClinicID,String PhysicianID) throws InterruptedException{
	
	
	
	ADDnewPatient.click();
	
	Thread.sleep(3000);
	
	 WebElement w =  driver.findElement(By.id("Prefix"));
		
	  Select s1 = new Select(w);
		
	  s1.selectByVisibleText(title);

	    
		FirstNam.sendKeys(ftName);
		LastNam.sendKeys(ltName);
		YearSinceVesectom.sendKeys(YearSincev);
			

	
	
	Age.sendKeys(Agge);
	Email.sendKeys(Emailid);
	
	  for(int i=1;i<=5;i++)
	  {
		  Phone.click();
	  	Phone.sendKeys(Phonenumber);
		  if(i!=5)
		  {
		 Phone.clear();
	  }}
	
	Address1.sendKeys(Address);
	Address2.sendKeys(Addresssecond);
	City.sendKeys(CityName);
	ZipCode.sendKeys(Zip);
	
	
	 WebElement ww =  driver.findElement(By.id("BCountryId"));
		
	  Select nm = new Select(ww);
		
	  nm.selectByIndex(1);
	  
	  WebElement w1 =  driver.findElement(By.id("BStateId"));
		
	   Select s2 = new Select(w1);
			
	   s2.selectByIndex(3);
	  
	   WebElement w3 =  driver.findElement(By.id("ClinicId"));
				
	   Select s3 = new Select(w3);
				
		s3.selectByIndex(1);
				  
		WebElement wb4 =  driver.findElement(By.id("PhysicianId"));
					
		Select s4 = new Select(wb4);
					
	    s4.selectByIndex(1);
	  
	   
	    
	    Savebutton.click();
	
	    
}


public void downloadPDF() throws Throwable{
	
	Downloadpdf.click();
	
	Thread.sleep(4000);
	  Robot robot = new Robot();  // Robot class throws AWT Exception	
    Thread.sleep(2000); // Thread.sleep throws InterruptedException	
//    robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
//    
//    Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
//    robot.keyPress(KeyEvent.VK_TAB);	
//    Thread.sleep(2000);	
//    robot.keyPress(KeyEvent.VK_TAB);	
//    Thread.sleep(2000);	
//    robot.keyPress(KeyEvent.VK_TAB);	
//    Thread.sleep(2000);	
    robot.keyPress(KeyEvent.VK_ENTER);	
    Thread.sleep(2000);
 	robot.keyRelease(KeyEvent.VK_ENTER);
 }	 
public void upcomingpatient(){
	
    boolean flag =Patient.isDisplayed();
		
		Assert.assertTrue(flag);
	}	  
	
}
	

	















