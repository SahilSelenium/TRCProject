package com.trc.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	
	LoginPage lp;
	HomePage homePage;
	
public LoginPageTest(){
	
	
	super();             //super will call testbase class constructor to define its proprties
}
	@BeforeMethod
	
	public void setUp(){
		
		intialization();
		
		lp = new LoginPage();
	}
	
	
	@Test(priority = 1)
	
	public void loginPageTitleTest(){
	String title = lp.validateLoginpageTitle();
	
	Assert.assertEquals(title, "Reversal Clinic | Home Page");
		
	}
	
	@Test(priority = 2)
	
	public void TrclogoImageTest(){
		
	boolean flag =	lp.validateTRCImage();
	
	Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void loginTest(){
    homePage = lp.Login(prop.getProperty("username"), prop.getProperty("password"));
    
	}
	
	
	
	@AfterMethod
	
	public void tearDown(){
		
		
		driver.quit();
	}
	
}





















