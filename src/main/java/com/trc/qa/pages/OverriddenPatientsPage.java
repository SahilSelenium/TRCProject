package com.trc.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.trc.qa.base.TestBase;


import junit.framework.Assert;

public class OverriddenPatientsPage  extends TestBase {
	
	
	@FindBy(id="btnSearch")
	WebElement Searchbutton;

	
	
	@FindBy(id="txtSearchString")
	WebElement SearchWithname;
		
	@FindBy(xpath="//*[text()='lrich']")
	WebElement james;

	public OverriddenPatientsPage(){
		
		PageFactory.initElements(driver, this);
	}


	public void searchpatientWithName( )  {
		
		
		
		SearchWithname.sendKeys("lrich");
		
		Searchbutton.click();
		
		
		
		
	boolean flag =	james.isDisplayed();


	Assert.assertTrue(flag);



		
	}
	
	
}