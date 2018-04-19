package com.trc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.AppointmentTypesPage;
import com.trc.qa.pages.BlogCategoriesPage;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.PatientEmailTemplatePage;
import com.trc.qa.util.TestUtil;

public class BlogCategoriesTest
extends TestBase {
    TestUtil testutil;
	LoginPage loginpage;
	BlogCategoriesPage BlogCategories;
	HomePage homepage;
	PatientEmailTemplatePage PETT;
	String sheetName1 ="AddnewTemplate";
	String sheetName ="AddnewTemplate";
	public BlogCategoriesTest(){
		super();
		
	}
	
	@BeforeMethod
	public void Setup(){
		
		intialization();
		PETT = new PatientEmailTemplatePage();
		homepage =new HomePage();
		testutil = new TestUtil();
		loginpage = new	LoginPage();
		BlogCategories =new BlogCategoriesPage();
		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	

		
	
		
	
	@Test(priority =1)
	public void ADDnewBlogCategories() throws Throwable   {
		
		homepage.BlogCategories();
		BlogCategories.AddAppointmentTypes();
	}
	
	

	

		
	
		
	
	@Test(priority =2)
	public void EditTemplate( ) throws Throwable   {
		
		homepage.BlogCategories();
		BlogCategories.EditTemplate();
	}
	
	@Test(priority=3)
	public void delete() throws InterruptedException{
		homepage.BlogCategories();
		BlogCategories.Templatedelete();
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.close();
	}
}



