package com.trc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.ClinincPgae;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.Physician;
import com.trc.qa.pages.ProcedureLandingPage;
import com.trc.qa.util.TestUtil;

public class ProcedureLandingTest extends TestBase {
	
	LoginPage lp;
	HomePage homePage;
	Physician physician;
	ClinincPgae clinicpage;
	ProcedureLandingPage Landingpagee;
	TestUtil testutil;
	public ProcedureLandingTest(){
		
		super();
	}

	
	@BeforeMethod
	
	public void setUp(){
		
		intialization();
		
		lp = new LoginPage();
		
		homePage = new HomePage();
		testutil = new TestUtil();
		Landingpagee = new ProcedureLandingPage();
	}


      @Test(priority = 1)
      
      
       public void VerifyHomePageTitleTest() throws InterruptedException {
    	  homePage.procedurepage();
    	  Landingpagee.Testlogo();
   
 }    
      
      
      @Test(priority = 2)
      
      
      public void VerifyquestionTest() {
    	  homePage.procedurepage();
   	  testutil.ScrollDown();
   	Landingpagee.Questionquery();
  
}    
      
      
 @Test(priority = 3)
      
      
      public void getitleTest() {
	 homePage.procedurepage();
	 Landingpagee.homepagetitle();
  
}    
 
 
 @Test(priority=4)
 
 public void requestguide(){
	 homePage.procedurepage();
	 Landingpagee.requestyouurfreeguide();
 }
 
 
 
 @Test(priority =5)
 
 public void homepagelink(){
	 homePage.procedurepage();
	 Landingpagee.LinksDisplayed();
 }
  	@AfterMethod
  	
  	public void tearDown(){
  		
  		
  		driver.quit();
  	}
  	
  }
      





















