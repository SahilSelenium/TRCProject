package com.trc.qa.pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trc.qa.base.TestBase;

public class DripCampaignsPage  extends TestBase {
	
	
	@FindBy(id="btnSearch")
	WebElement Searchbutton;

	
	
	@FindBy(xpath="//tr[1]/td[2]/a[1]")
	WebElement Edit;
	
	@FindBy(xpath="//tr[1]/td[2]/a[2]")
	WebElement Delete;
	
	@FindBy(id="Name")
	WebElement Name;

	@FindBy(id="btnUpdateClinic")
	WebElement UpdateClinic;
	
	@FindBy(id="btnClose")
	WebElement btnClose;
	
	
	public DripCampaignsPage(){
		
		PageFactory.initElements(driver, this);
	}


	public void DripCampaignEdit( )  {
		
		
		
		Edit.click();
		
	    Name.clear();
	    
	    Name.sendKeys("Free Report - Less Than 10 Years");
         
	    UpdateClinic.click();
	    
	    Edit.click();
	    
	    Name.clear();
	    
	    Name.sendKeys("Free Report - Less Than 10 Years");

         UpdateClinic.click();
		
	}
	
public void DripCampaigDelete( )  {
		
		
		
		Delete.click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.dismiss();
		
	}
}