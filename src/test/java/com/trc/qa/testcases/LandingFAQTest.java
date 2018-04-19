package com.trc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.ClinincPgae;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LandingFAQPage;
import com.trc.qa.pages.Landingdrwilsonpage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.Physician;
import com.trc.qa.util.TestUtil;

public class LandingFAQTest extends TestBase {
	
	LoginPage lp;
	HomePage homePage;
	Physician physician;
	ClinincPgae clinicpage;
	LandingFAQPage Landingpagee;
	TestUtil testutil;
	public LandingFAQTest(){
		
		super();
	}

	
	@BeforeMethod
	
	public void setUp(){
		
		intialization();
		
		lp = new LoginPage();
		
		homePage = new HomePage();
		testutil = new TestUtil();
		Landingpagee = new LandingFAQPage();
	}


      @Test(priority = 1)
      
      
       public void VerifyHomePageTitleTest() throws InterruptedException {
    	  homePage.faqpage();
    	  Landingpagee.Testlogo();
   
 }    
      
      
      @Test(priority = 2)
      
      
      public void VerifyquestionTest() {
    	  homePage.faqpage();
   	  testutil.ScrollDown();
   	Landingpagee.Questionquery();
  
}    
      
      
 @Test(priority = 3)
      
      
      public void getitleTest() {
	 homePage.faqpage();
	 Landingpagee.homepagetitle();
  
}    
 
 
 @Test(priority=4)
 
 public void requestguide(){
	 homePage.faqpage();
	 Landingpagee.requestyouurfreeguide();
 }
 
 
 
 @Test(priority =5)
 
 public void homepagelink(){
	 homePage.faqpage();
	 Landingpagee.LinksDisplayed();
 }
  	@AfterMethod
  	
  	public void tearDown(){
  		
  		
  		driver.quit();
  	}
  	
  }
      























