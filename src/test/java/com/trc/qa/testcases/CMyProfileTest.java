
package com.trc.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.MyProfilePage;
import com.trc.qa.pages.SystemEmailTemplateTypesPage;
import com.trc.qa.util.TestUtil;

public class CMyProfileTest extends TestBase {
    TestUtil testutil;
	LoginPage loginpage;
	MyProfilePage profile;
	HomePage homepage;
	

	public CMyProfileTest(){
		super();
		
	}
	
	@BeforeMethod
	public void Setup(){
		
		intialization();
	
		homepage =new HomePage();
		testutil = new TestUtil();
		loginpage = new	LoginPage();
		
		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		profile =new MyProfilePage();
	}
	

		
	
		
	
	@Test(priority =1)
	public void Changeprofilepage() throws Throwable   {
		
		homepage.ClickOnMYProfile();
		
		profile.ChangeMyProfilePage();
	}
	
	

	

		
	
		
	
	@Test(priority =2)
	public void Editprofilepage( ) throws Throwable   {
		
    homepage.ClickOnMYProfile();
		
		profile.EditMyProfilePage();
	}
	
//	@Test(priority=3)
	public void uploadprofilepage() throws InterruptedException, Throwable{
        homepage.ClickOnMYProfile();
		
		profile.UploadProfile();
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.close();
	}
}






