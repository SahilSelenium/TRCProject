package com.trc.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.trc.qa.base.TestBase;
import com.trc.qa.util.TestUtil;

public class ClinincPgae extends TestBase {

	TestUtil util = new TestUtil();

	@FindBy(id="btnNewClinic")
	WebElement AddNewClinic;

	
	@FindBy(linkText="Edit")
	WebElement Edit;
	
	@FindBy(linkText="Delete")
	WebElement Delete;
	
	
	@FindBy(id="Name")
	WebElement FirstNam;
		
	@FindBy(id="Addr1")
	WebElement Address1;
	
	@FindBy(id="Addr2")
	WebElement Address2;
	
	@FindBy(id="PhoneNumber")
	WebElement Phone;
	
	
	@FindBy(id="City")
	WebElement City;
	
	@FindBy(id="Zip")
	WebElement ZipCode;
	
	@FindBy(id="Notes")
	WebElement Notes;
	
	@FindBy(id="btnAddClinic")
	WebElement Savebutton;

	@FindBy(id="btnUpdateClinic")
	WebElement btnUpdateClinic;
	
	
	@FindBy(id="btnClose")
	WebElement Closebtn;

	public ClinincPgae(){
		
		PageFactory.initElements(driver, this);
	}


	public void CreateNewClinic(  String ftName,String Phonenumber,String Address,String Addresssecond,String CityName, 
			
			String Zip , String notes ) throws InterruptedException{
		
		
		AddNewClinic.click();
		
		
		    
			FirstNam.sendKeys(ftName,Keys.TAB,"1234567898");
			
		
		
		 
		
		Address1.sendKeys(Address);
		Address2.sendKeys(Addresssecond);
		City.sendKeys(CityName);
		ZipCode.sendKeys(Zip.substring(0, Zip.length() - 2));
		
		
		 WebElement ww =  driver.findElement(By.id("CountryId"));
			
		  Select nm = new Select(ww);
			
		  nm.selectByIndex(2);
		  
		  WebElement w1 =  driver.findElement(By.id("StateId"));
			
		   Select s2 = new Select(w1);
				
		   s2.selectByIndex(2);
		  
		  
		  Notes.sendKeys(notes);
		  
		  
		  
		    
		 Savebutton.click();
		
		    
	}


	
	
	
	
	
	
	
	
	
public void CreateNewClinicEdit(  String ftName,String Phonenumber,String Address,String Addresssecond,String CityName, 
			
			String Zip , String notes ) throws InterruptedException{
	     
		Thread.sleep(3000);
		Edit.click();
		Thread.sleep(3000);
		util.waitforElementPresent(FirstNam);
		   FirstNam.clear();
		    
		   FirstNam.sendKeys(ftName,Keys.TAB,"1234567898");
			
			
		  Address1.clear();
		Address1.sendKeys(Address);
		Address2.clear();
		Address2.sendKeys(Addresssecond);
		City.clear();
		City.sendKeys(CityName);
		ZipCode.clear();
		ZipCode.sendKeys(Zip.substring(0, Zip.length() - 2));
		
		
		 WebElement ww =  driver.findElement(By.id("CountryId"));
			
		  Select nm = new Select(ww);
			
		  nm.selectByIndex(2);
		  
		  WebElement w1 =  driver.findElement(By.id("StateId"));
			
		   Select s2 = new Select(w1);
				
		   s2.selectByIndex(2);
		  
		   Notes.clear();
		  Notes.sendKeys(notes);
		  
		  
		   
		    
		  btnUpdateClinic.click();
		
		    
	}

public void CreateNewClinicDelete() throws InterruptedException{
	
	util.waitforElementPresent(Delete);
	
	
	
//	Thread.sleep(2000);
//	
//	Delete.click();
//	Thread.sleep(2000);
//	
//	Alert alt = driver.switchTo().alert();
//	
//	
//		
//	alt.accept();
	
	
}


		
	}
		


