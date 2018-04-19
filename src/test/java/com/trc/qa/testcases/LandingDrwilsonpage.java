package com.trc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.ClinincPgae;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.Landingdrwilsonpage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.Physician;
import com.trc.qa.pages.ProcedureLandingPage;
import com.trc.qa.util.TestUtil;

public class LandingDrwilsonpage extends TestBase {
	
	LoginPage lp;
	HomePage homePage;
	Physician physician;
	ClinincPgae clinicpage;
	Landingdrwilsonpage Landingpagee;
	TestUtil testutil;
	public LandingDrwilsonpage(){
		
		super();
	}

	
	@BeforeMethod
	
	public void setUp(){
		
		intialization();
		
		lp = new LoginPage();
		
		homePage = new HomePage();
		testutil = new TestUtil();
		Landingpagee = new Landingdrwilsonpage();
	}


      @Test(priority = 1)
      
      
       public void VerifyHomePageTitleTest() throws InterruptedException {
    	  homePage.drwilsonpage();
    	  Landingpagee.Testlogo();
   
 }    
      
      
      @Test(priority = 2)
      
      
      public void VerifyquestionTest() {
    	  homePage.drwilsonpage();
   	  testutil.ScrollDown();
   	Landingpagee.Questionquery();
  
}    
      
      
 @Test(priority = 3)
      
      
      public void getitleTest() {
	 homePage.drwilsonpage();
	 Landingpagee.homepagetitle();
  
}    
 
 
 @Test(priority=4)
 
 public void requestguide(){
	 homePage.drwilsonpage();
	 Landingpagee.requestyouurfreeguide();
 }
 
 
 
 @Test(priority =5)
 
 public void homepagelink(){
	 homePage.drwilsonpage();
	 Landingpagee.LinksDisplayed();
 }
  	@AfterMethod
  	
  	public void tearDown(){
  		
  		
  		driver.quit();
  	}
  	
  }
      






















