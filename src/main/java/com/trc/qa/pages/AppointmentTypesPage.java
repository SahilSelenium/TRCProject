package com.trc.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trc.qa.base.TestBase;

public class AppointmentTypesPage extends TestBase {

	@FindBy(xpath=".//*[@id='grdAppointmenttypes']/div[1]/a")
	WebElement AddnewAppointment;
	
	
	
	@FindBy(id="Name")
	WebElement Name;
	

	
	@FindBy(linkText="Update")
	WebElement Update;
	
	@FindBy(linkText="Cancel")
	WebElement Canceled;
	
	@FindBy(xpath="//tr[1]/td[2]/a[1]")
	WebElement Edit;
	
	@FindBy(xpath="//tr[1]/td[2]/a[2]")
	WebElement Delete;
	

	
	@FindBy(linkText="Cancel")
	WebElement Cancel;
	
	public AppointmentTypesPage(){
		
		PageFactory.initElements(driver, this);
	}


	public void AddAppointmentTypes(){
		
		AddnewAppointment.click();
		Name.sendKeys("Phone Appointment");
		    
		Update.click();
		
		
	    
		  
	    
	}
	
	public void EditTemplate()    {
		
	    
		Edit.click();
		
		Name.clear();
		Name.sendKeys("Phone Appointment");
	
		
	    
		  
	    Update.click();
	}	
	
	
public void Templatedelete() throws InterruptedException {
		
	    
	Delete.click();
	Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
	
	
	
		
	    
		  
	   
	}	
	
}



