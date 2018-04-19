package com.trc.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trc.qa.base.TestBase;

public class SystemEmailTemplateTypesPage extends TestBase {

	@FindBy(linkText="Add new record")
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
	
	public SystemEmailTemplateTypesPage(){
		
		PageFactory.initElements(driver, this);
	}


	public void AddAppointmentTypes(){
		
		AddnewAppointment.click();
		AddnewAppointment.click();
		
		Name.sendKeys("Account Created");
		    
		Update.click();
		
		
	    
		  
	    
	}
	
	public void EditTemplate()    {
		
	    
		Edit.click();
		
		Name.clear();
		Name.sendKeys("Account Created");
	
		
	    
		  
	    Update.click();
	}	
	
	
public void Templatedelete() throws InterruptedException {
		
	    
	Delete.click();
	
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt);
		Thread.sleep(2000);
		alt.accept();
	
	
	
		
	    
		  
	   
	}	
	
}




