package com.trc.qa.pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.trc.qa.base.TestBase;


import junit.framework.Assert;

public class ArchivedPatientsListPage  extends TestBase {
	
	
	@FindBy(id="btnSearch")
	WebElement Searchbutton;

	
	
	@FindBy(id="txtSearchString")
	WebElement SearchWithname;
		
	@FindBy(xpath="//*[text()='Eric']")
	WebElement Eric;

	public ArchivedPatientsListPage(){
		
		PageFactory.initElements(driver, this);
	}


	public void searchpatientWithName( )  {
		
		
		
		SearchWithname.sendKeys("Eric");
		
		Searchbutton.click();
		
		
		
		
	boolean flag =	Eric.isDisplayed();


	Assert.assertTrue(flag);



		
	}
	
	
}