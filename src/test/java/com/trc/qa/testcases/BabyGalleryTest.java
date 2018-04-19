package com.trc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.BabyGalleryPage;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.util.TestUtil;

public class BabyGalleryTest extends TestBase {
    TestUtil testutil;
	LoginPage loginpage;
	BabyGalleryPage profile;
	HomePage homepage;
	

	public BabyGalleryTest(){
		super();
		
	}
	
	@BeforeMethod
	public void Setup(){
		
		intialization();
	
		homepage =new HomePage();
		testutil = new TestUtil();
		loginpage = new	LoginPage();
		
		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		profile =new BabyGalleryPage();
	}
	

		
	
		
	
//	@Test(priority =1)
	public void AddNewPhototogallery() throws Throwable   {
		
		homepage.ClickonBabyGallery();
		
		profile.AddNewBabyPhoto();
		
	}
	
	

	

		
	
		
	
	@Test(priority =2)
	public void EditPhototogallery( ) throws Throwable   {
		homepage.ClickonBabyGallery();
		profile.EditbabygalleryPage();
	}
	
	@Test(priority=3)
	public void Deletephotofromgallery() throws InterruptedException, Throwable{
		homepage.ClickonBabyGallery();
		profile.Delete();
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.close();
	}
}







