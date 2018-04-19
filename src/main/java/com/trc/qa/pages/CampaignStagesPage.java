package com.trc.qa.pages;





import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trc.qa.base.TestBase;

public class CampaignStagesPage  extends TestBase {
	
	
	@FindBy(id="btnSearch")
	WebElement Searchbutton;

	
	
	@FindBy(xpath="//tr[1]/td[4]/a[1]")
	WebElement Edit;
	
	@FindBy(xpath="//tr[1]/td[4]/a[2]")
	WebElement Delete;
	
	@FindBy(id="StageName")
	WebElement Name;

	@FindBy(id="EmailFromName")
	WebElement EmailFromName;
	
	@FindBy(id="btnAddStage")
	WebElement btnAddStage;
	
	@FindBy(id="btnClose")
	WebElement btnClose;
	
	
	
	public CampaignStagesPage(){
		
		PageFactory.initElements(driver, this);
	}


	public void DripStageEdit( )  {
		
		
		
		Edit.click();
		
	    Name.clear();
	    
	    Name.sendKeys("The Free Report  9 You Requested");
        
	    EmailFromName.clear();
	    
	    EmailFromName.sendKeys("Info");
	    
	    btnAddStage.click();
	    
	   
		
	}
	
public void DripStageDelete( )  {
		
		
		
		Delete.click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.dismiss();
		
	}
}