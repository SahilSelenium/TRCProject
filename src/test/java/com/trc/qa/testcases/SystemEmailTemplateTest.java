package com.trc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.PatientEmailTemplatePage;
import com.trc.qa.pages.SystemEmailTemplatePage;
import com.trc.qa.util.TestUtil;

public class SystemEmailTemplateTest  extends TestBase {
	     TestUtil testutil;
		LoginPage loginpage;
		SystemEmailTemplatePage SystemEMailTEMPLATE;
		HomePage homepage;
		PatientEmailTemplatePage PETT;
		String sheetName1 ="AddnewTemplate";
		String sheetName ="AddnewTemplate";
		public SystemEmailTemplateTest(){
			super();
			
		}
		
		@BeforeMethod
		public void Setup(){
			
			intialization();
			PETT = new PatientEmailTemplatePage();
			homepage =new HomePage();
			testutil = new TestUtil();
			loginpage = new	LoginPage();
			SystemEMailTEMPLATE =new SystemEmailTemplatePage();
			loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
			
		}
		
//		@DataProvider
//		public Object[][] Testdata(){
//			
//		Object data1[][]=	TestUtil.getTestData(sheetName1);
//			
//			return data1;
//			
//		
//			
//		}
//		@Test(priority =1, dataProvider ="Testdata")
//		public void ADDnewTemplate(String NAME, String FromNAme , String FromAddress , String Subject , String Notes) throws Throwable   {
//			
//			homepage.SystemEmailTemplate();
//			SystemEMailTEMPLATE.AddSystemTemplate(NAME, FromNAme, FromAddress, Subject, Notes);
//		}
//		
//		
//
//		
//		@DataProvider
//		public Object[][] Testdataa(){
//			
//		Object data[][]=	TestUtil.getTestData(sheetName);
//			
//			return data;
//			
//		
//			
//		}
//		@Test(priority =2, dataProvider ="Testdataa")
//		public void EditTemplate(String NAME, String FromNAme , String FromAddress , String Subject,String Notes ) throws Throwable   {
//			
//			homepage.SystemEmailTemplate();
//			SystemEMailTEMPLATE.EditTemplate(NAME, FromNAme, FromAddress, Subject, Notes);
//		}
		
		@Test(priority=3)
		public void delete() throws InterruptedException{
			homepage.SystemEmailTemplate();
			SystemEMailTEMPLATE.Templatedelete();
			
		}
		
		@AfterMethod
		public void teardown(){
			driver.close();
		}
	}

