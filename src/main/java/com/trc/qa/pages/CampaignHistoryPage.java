package com.trc.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trc.qa.base.TestBase;

public class CampaignHistoryPage  extends TestBase {
	
	
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
	
	
	public CampaignHistoryPage(){
		
		PageFactory.initElements(driver, this);
	}


	public void DripCampaignEdit( )  {
		
		
		
		
	}
	
public void DripCampaigDelete( )  {
		
		
		
		
		
	}
}