package com.trc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.AppointmentTypesPage;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.PatientEmailTemplatePage;
import com.trc.qa.pages.SystemEmailTemplatePage;
import com.trc.qa.util.TestUtil;

public class AppointmentTypesTest extends TestBase {
    TestUtil testutil;
	LoginPage loginpage;
	AppointmentTypesPage Appointment;
	HomePage homepage;
	PatientEmailTemplatePage PETT;
	String sheetName1 ="AddnewTemplate";
	String sheetName ="AddnewTemplate";
	public AppointmentTypesTest(){
		super();
		
	}
	
	@BeforeMethod
	public void Setup(){
		
		intialization();
		PETT = new PatientEmailTemplatePage();
		homepage =new HomePage();
		testutil = new TestUtil();
		loginpage = new	LoginPage();
		Appointment =new AppointmentTypesPage();
		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	

		
	
		
	
	@Test(priority =1)
	public void ADDnewTemplate() throws Throwable   {
		
		homepage.AppointmentTypesPage1();
		Appointment.AddAppointmentTypes();
	}
	
	

	

		
	
		
	
	@Test(priority =2)
	public void EditTemplate( ) throws Throwable   {
		
		homepage.AppointmentTypesPage1();
		Appointment.EditTemplate();
	}
	
	@Test(priority=3)
	public void delete() throws InterruptedException{
		homepage.AppointmentTypesPage1();
		Appointment.Templatedelete();
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.close();
	}
}


