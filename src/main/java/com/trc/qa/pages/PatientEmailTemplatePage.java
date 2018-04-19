package com.trc.qa.pages;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trc.qa.base.TestBase;

public class PatientEmailTemplatePage  extends TestBase {
	
	
	

	
	
	@FindBy(xpath="//*[@id='grdPatientEmailTemplates']/div[1]/a")
	WebElement AddnewTemplate;
	
	@FindBy(id="Name")
	WebElement Name;
	

	@FindBy(id="FromName")
	WebElement FromName;
	
	@FindBy(id="FromAddress")
	WebElement FromAddres;
	
	@FindBy(id="Subject")
	WebElement Subjects;
	
	@FindBy(xpath="//iframe")
	WebElement Message;
	
	@FindBy(xpath="//tr[1]/td[5]/a[1]")
	WebElement Edit;
	
	@FindBy(xpath="//tr[1]/td[5]/a[2]")
	WebElement Delete;
	
	@FindBy(linkText="Update")
	WebElement Update;
	
	@FindBy(linkText="Cancel")
	WebElement Cancel;
	
	public PatientEmailTemplatePage(){
		
		PageFactory.initElements(driver, this);
	}


	public void AddnewTemplate(String NAME, String FromNAme , String FromAddress , String Subject , String Notes)    {
		
		    
		AddnewTemplate.click();
		
		Name.sendKeys(NAME);
		
		FromName.sendKeys(FromNAme);
		
		FromAddres.sendKeys(FromAddress);
		Subjects.sendKeys(Subject);
		
		
		Message.click();
		Message.sendKeys(Notes);
		
		Cancel.click();
	    
		  
	    //Update.click();
	}
	
	public void EditTemplate(String NAME, String FromNAme , String FromAddress , String Subject ,String Notes)    {
		
	    
		Edit.click();
		Name.clear();
		Name.sendKeys(NAME);
		FromName.clear();
		FromName.sendKeys(FromNAme);
		FromAddres.clear();
		
		FromAddres.sendKeys(FromAddress);
		Subjects.clear();
		Subjects.sendKeys(Subject);
		
		
		Message.click();
		Message.sendKeys(Notes);
	
		
	    
		  
	    Update.click();
	}	
	
	
public void Templatedelete() throws InterruptedException {
		
	    
		Delete.click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
	
	
	
		
	    
		  
	    
	}	
	
	

}