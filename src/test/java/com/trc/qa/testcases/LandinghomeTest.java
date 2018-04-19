package com.trc.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.ClinincPgae;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;

import com.trc.qa.pages.Physician;
import com.trc.qa.util.TestUtil;

public class LandinghomeTest extends TestBase {
	
	LoginPage lp;
	HomePage homePage;
	Physician physician;
	ClinincPgae clinicpage;
	LandingHomePage Landingpage;
	TestUtil testutil;
	public LandinghomeTest(){
		
		super();
	}

	
	@BeforeMethod
	
	public void setUp(){
		
		intialization();
		
		lp = new LoginPage();
		
		homePage = new HomePage();
		testutil = new TestUtil();
		Landingpage = new LandingHomePage();
	}


      @Test(priority = 1)
      
      
       public void VerifyHomePageTitleTest() {
    	
    	  Landingpage.Testlogo();
   
 }    
      
      
      @Test(priority = 2)
      
      
      public void VerifyquestionTest() {
   	  testutil.ScrollDown();
   	  Landingpage.Questionquery();
  
}    
      
      
 @Test(priority = 3)
      
      
      public void getitleTest() {
   	
   	  Landingpage.homepagetitle();
  
}    
 
 
 @Test(priority=4)
 
 public void requestguide(){
	 
	 Landingpage.requestyouurfreeguide();
 }
 
 
 
 @Test(priority =5)
 
 public void homepagelink(){
	 Landingpage.LinksDisplayed();
 }
  	@AfterMethod
  	
  	public void tearDown(){
  		
  		
  		driver.quit();
  	}
  	
  }
      




















