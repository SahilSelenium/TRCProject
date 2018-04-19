package com.trc.qa.pages;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.trc.qa.base.TestBase;
import com.trc.qa.util.TestUtil;

public class Physician extends TestBase{
 
	TestUtil test = new TestUtil();
	
	@FindBy(id="btnNewPhysician")
	WebElement AddnewPhysician;
	
	@FindBy(id="FirstName")
	WebElement FirstName;

	@FindBy(id="MiddleName")
	WebElement MiddleName;
	
	@FindBy(id="Email")
	WebElement Email;
	
	@FindBy(id="LastName")
	WebElement LastNam;

	@FindBy(id="HomePhone")
	WebElement Phone;
	
	
	@FindBy(id="MobilePhone")     
	WebElement MobilePhone;

	@FindBy(id="EmergencyContactName")
	WebElement EmergencyContactName;


	@FindBy(id="EmergencyContactPhone")
	WebElement EmergencyContactPhone;


	@FindBy(id="Address1")
	WebElement Address1;


	@FindBy(id="Address2")
	WebElement Address2;


	@FindBy(id="City")
	WebElement City;

	@FindBy(id="ZipCode")
	WebElement ZipCode;

	
	
	
	@FindBy(id="btnAddPhysician")
	WebElement btnAddPhysician;

	@FindBy(id="btnClose")
	WebElement btnClose;
	
	
	@FindBy(xpath="//form/div[1]/div[2]/div[1]/span[1]/span/span/span[1]/span")
	WebElement click1;

	@FindBy(xpath="//form/div[1]/div[2]/div[2]/span[1]/span/span/span[1]/span")
	WebElement click2;
	
	@FindBy(xpath="//form/div[1]/div[2]/div[3]/span[1]/span/span/span[1]/span")
	WebElement click3;
	
	@FindBy(xpath="//form/div[1]/div[2]/div[4]/span[1]/span/span/span[1]/span")
	WebElement click4;

public Physician(){
	
	PageFactory.initElements(driver, this);
}

public void AddnewPhysician(String fname,String mname,String Lname,String Emailid,String hphone,String Mphone,String EmName,String Emphone,String Add1,String add2,String city,String zip) throws InterruptedException{
	
	AddnewPhysician.click();
	
	FirstName.sendKeys(fname);
	MiddleName.sendKeys(mname);
	LastNam.sendKeys(Lname);
		  
	 Email.sendKeys(Emailid,Keys.TAB,"1234567898",Keys.TAB,"1234567898");
		 
	 
	
		  
		  
		  
	  	
		StringSelection ss = new StringSelection("0987656789");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		
		
	
	 
	
	 EmergencyContactName.sendKeys(EmName,Keys.TAB,"1234567898");
	 

	 
	 
	 Address1.sendKeys(Add1); 
	 Address2.sendKeys(add2);
	 City.sendKeys(city); 
	 ZipCode.sendKeys(zip.substring(0, zip.length() - 2));
	 	  
	  
	  



	
	WebElement ww =  driver.findElement(By.id("CountryId"));
	
	  Select nm = new Select(ww);
		
	  nm.selectByIndex(1);
	  
	 
		Thread.sleep(4000);
	
	  
	  WebElement w1 =  driver.findElement(By.id("StateId"));
		
	   Select s2 = new Select(w1);
			
	   s2.selectByIndex(3);
	   
	   
	   driver.findElement(By.xpath("//form/div[1]/div[3]/div/span/span/span[2]")).click();
		  Thread.sleep(3000);
		  List<WebElement>list =  driver.findElements(By.xpath("//*[@id='ClinicId-list']"));
		  
		  for(WebElement ele: list)
		  {
			  if(ele.getAttribute("innerHTML").contains("z6ynd"));
	{
		 
		 ele.click();
		 break;
		 
	}

		  }
		 btnAddPhysician.click();
	  
}


































public void AddnewPhysicianvalidation(String fname,String mname,String Lname,String Emailid,String hphone,String Mphone,String EmName,String Emphone,String Add1,String add2,String city,String zip) throws InterruptedException{
	
	AddnewPhysician.click();
	
	btnAddPhysician.click();
	FirstName.sendKeys(fname);
	
	MiddleName.sendKeys(mname);
	btnAddPhysician.click();
	LastNam.sendKeys(Lname);
	btnAddPhysician.click();
	Email.sendKeys(Emailid,Keys.TAB,"1234567898",Keys.TAB,"1234567898");
		 
	 
	
	 
	 btnAddPhysician.click();
	
	 btnAddPhysician.click();
	 EmergencyContactName.sendKeys(EmName,Keys.TAB,"1234567898");
	 
	
	 
	 btnAddPhysician.click();
	 Address1.sendKeys(Add1); 
	 Address2.sendKeys(add2);
	 btnAddPhysician.click();
	 City.sendKeys(city); 
	 btnAddPhysician.click();
	 ZipCode.sendKeys(zip.substring(0, zip.length() - 2));
	 	  
	  
	  



	 btnAddPhysician.click();
	WebElement ww =  driver.findElement(By.id("CountryId"));
	
	  Select nm = new Select(ww);
		
	  nm.selectByIndex(1);
	  
	 
		Thread.sleep(4000);
	
		btnAddPhysician.click();
	  WebElement w1 =  driver.findElement(By.id("StateId"));
		
	   Select s2 = new Select(w1);
			
	   s2.selectByIndex(3);
	   
	   
	   driver.findElement(By.xpath("//form/div[1]/div[3]/div/span/span/span[2]")).click();
		  Thread.sleep(3000);
		  List<WebElement>list =  driver.findElements(By.xpath("//*[@id='ClinicId-list']"));
		  
		  for(WebElement ele: list)
		  {
			  if(ele.getAttribute("innerHTML").contains("z6ynd"));
	{
		 
		 ele.click();
		 break;
		 
	}

		  }
		  btnClose.click();
	  
}




}