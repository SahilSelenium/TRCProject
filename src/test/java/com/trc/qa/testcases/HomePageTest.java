package com.trc.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.ClinincPgae;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.PatientsPage;
import com.trc.qa.pages.Physician;

public class HomePageTest extends TestBase {
	
	LoginPage lp;
	HomePage homePage;
	Physician physician;
	ClinincPgae clinicpage;
	PatientsPage patientpage;
	public HomePageTest(){
		
		super();
	}

	
	@BeforeMethod
	
	public void setUp(){
		
		intialization();
		
		lp = new LoginPage();
		
		homePage = lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	}


      @Test(priority = 1)
      
      
       public void VerifyHomePageTitleTest() {
    	
   String title =    homePage.VerifyHomePageTitle();
   
   Assert.assertEquals(title, "Reversal Clinic | Home Page");
         	       	  
      }
      
      @Test(priority = 2)
      
      
      public void VerifyHomePageImageTest() {
   	
        boolean flag = homePage.HomeLogo();
        
        Assert.assertTrue(flag);
     }    

      
      @Test(priority = 3)
      
      
      public void VerifyHomePageMessage() {
   	
    String Welcomemessage  =    homePage.VerifyWelcomemessage();
        
        Assert.assertTrue(Welcomemessage.contains("Welcome"));
        
        
     }  
      
       @Test(priority = 4)
      
      
      public void VerifyMonthDepositText() {
   	
    String Welcomemessage  =    homePage.VerifyMonthDepositText();
        
        Assert.assertTrue(Welcomemessage.contains("12 Month Deposit"));
      
      
      
      
       }
      
      
      
       @Test(priority = 5)
       
       
         public void VerifyScoreText() {
    	
         String Welcomemessage  = homePage.VerifyScoreText();
         System.out.println(Welcomemessage);
        
       
         Assert.assertTrue(Welcomemessage.contains("Score"), "");
       
       
        }  
      
@Test(priority = 6)
       
       
       public void VerifyClinicLink() {
    	
	clinicpage =    homePage.Clickoncliniclink();
         
           
        }   
      
@Test(priority = 7)


public void VerifyphsicianLink() {
	
	physician =homePage.ClickonPhysicianslink();
  
    
 }    

@Test(priority = 8)


public void VerifypatientLink() {
	
patientpage = homePage.ClickonPatientslink();
  
    
 }    
      
  	@AfterMethod
  	
  	public void tearDown(){
  		
  		
  		driver.quit();
  	}
  	
  }
      



















