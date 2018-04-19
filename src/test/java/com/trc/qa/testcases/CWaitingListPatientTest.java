
package com.trc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.PatientsPage;
import com.trc.qa.pages.WaitingListPatientPage;
import com.trc.qa.util.TestUtil;

public class CWaitingListPatientTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	PatientsPage pp;
	WaitingListPatientPage WLP;
	String sheetName="AddnewClinic";
	 
	public CWaitingListPatientTest(){
		
		super();
	}
	
	
@BeforeMethod
	
	public void setUp(){
		
	intialization();
	
	loginpage = new LoginPage();
		
	homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	homepage = new HomePage();
	testutil = new TestUtil();
	pp= new PatientsPage();
	WLP = new WaitingListPatientPage();
	
	}
	
	
@Test(priority=1)
public void searchWaitingListPatient() throws InterruptedException
{
	homepage.clickonWaitingListPatientslink();
	WLP.searchpatientWithName();
}
 
@AfterMethod
public void tearDown(){
	driver.close();
}
}
