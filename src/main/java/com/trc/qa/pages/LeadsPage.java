package com.trc.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.trc.qa.base.TestBase;


import junit.framework.Assert;

public class LeadsPage  extends TestBase {
	
	
	@FindBy(id="Search")
	WebElement Searchbutton;

	
	
	@FindBy(id="txtSearchString")
	WebElement SearchWithname;
		
	@FindBy(xpath="//*[text()='joseph keen']")
	WebElement shamkumar;
	
	@FindBy(xpath=".//*[@id='grdLeads']//tr[1]/td[6]/a[2]")
	WebElement View;

	@FindBy(xpath="//*[text()='Date Created ']")
	WebElement Viewed;
	
	
	
	public LeadsPage(){
		
		PageFactory.initElements(driver, this);
	}


	public void searchpatientWithName( )  {
		
		
		
		SearchWithname.sendKeys("joseph keen");
		
		Searchbutton.click();
		
		
		
		
	boolean flag =	shamkumar.isDisplayed();


	Assert.assertTrue(flag);



		
	}
	
public void ViewLeads( )  {
		
		
		
		View.click();
		boolean flag =	Viewed.isDisplayed();


		Assert.assertTrue(flag);

		
	}
}