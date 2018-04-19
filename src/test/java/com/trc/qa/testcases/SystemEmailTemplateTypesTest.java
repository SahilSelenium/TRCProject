package com.trc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.BlogCategoriesPage;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.PatientEmailTemplatePage;
import com.trc.qa.pages.SystemEmailTemplateTypesPage;
import com.trc.qa.util.TestUtil;

public class SystemEmailTemplateTypesTest extends TestBase {
    TestUtil testutil;
	LoginPage loginpage;
	SystemEmailTemplateTypesPage SystemEmailTemplate;
	HomePage homepage;
	

	public SystemEmailTemplateTypesTest(){
		super();
		
	}
	
	@BeforeMethod
	public void Setup(){
		
		intialization();
	
		homepage =new HomePage();
		testutil = new TestUtil();
		loginpage = new	LoginPage();
		
		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		SystemEmailTemplate =new SystemEmailTemplateTypesPage();
	}
	

		
	
		
	
	@Test(priority =1)
	public void ADDnewBlogCategories() throws Throwable   {
		
		homepage.SystemEmailTemplateTypes();
		SystemEmailTemplate.AddAppointmentTypes();
	}
	
	

	

		
	
		
	
	@Test(priority =2)
	public void EditTemplate( ) throws Throwable   {
		
		homepage.SystemEmailTemplateTypes();
		SystemEmailTemplate.EditTemplate();
	}
	
	@Test(priority=3)
	public void delete() throws InterruptedException{
		homepage.SystemEmailTemplateTypes();
		SystemEmailTemplate.Templatedelete();
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.close();
	}
}




