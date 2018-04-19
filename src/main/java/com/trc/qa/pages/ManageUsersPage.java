package com.trc.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trc.qa.base.TestBase;

public class ManageUsersPage extends TestBase {

	@FindBy(id="btnNewUser")
	WebElement AddnewNewUser;
	
	
	
	@FindBy(id="searchbox")
	WebElement searchbox;
	

	@FindBy(id="btnSearch")
	WebElement searchbutton;
	
	@FindBy(id="FirstName")
	WebElement FirstName;
	
	@FindBy(id="LastName")
	WebElement LastName;
	
	
	
	@FindBy(id="btnAddUser")
	WebElement AddUser;
	
	@FindBy(id="btnClose")
	WebElement btnClose;
	
	@FindBy(id="btnUpdateUser")
	WebElement btnUpdateUser;
	
	
	@FindBy(xpath="//tr[1]/td[5]/a[2]")
	WebElement Edit;
	
	@FindBy(xpath="//tr[1]/td[5]/a[3]")
	WebElement Delete;
	

	
	
	
	public ManageUsersPage(){
		
		PageFactory.initElements(driver, this);
	}


	public void SearchUser(){
		
		
		searchbox.sendKeys("Wilson");
		
		
		searchbutton.click();
	    
		  
	    
	}
	
     public void Adduser()    {
		
	    
    	 AddnewNewUser.click();
		
    	 FirstName.sendKeys("Nelson");
	    
    	 LastName.sendKeys("merdock");
	    
		  
    	 AddUser.click();
	}	
	public void EditTemplate()    {
		
	    
		Edit.click();
		
		FirstName.clear();
		FirstName.sendKeys("Nelson");
		LastName.clear();
   	    LastName.sendKeys("merdock");
	    
		  
   	     btnUpdateUser.click();
	    
		
	    
		  
	    
	}	
	
	
public void userdelete() throws InterruptedException {
		
	    
	Delete.click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt);
		alt.accept();
	
	
	
		
	    
		  
	   
	}	
	
}


