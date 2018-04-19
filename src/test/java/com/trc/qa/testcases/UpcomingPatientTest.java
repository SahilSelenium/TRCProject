
package com.trc.qa.testcases;
import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.ClinincPgae;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.PatientsPage;
import com.trc.qa.pages.UpcomingPatientsPage;
import com.trc.qa.util.TestUtil;

public class UpcomingPatientTest  extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	UpcomingPatientsPage pp;
	ClinincPgae AddnewClinic;
	String sheetName="AddnewClinic";
	 
	public UpcomingPatientTest(){
		
		super();
	}
	
	
@BeforeMethod
	
	public void setUp(){
		
	intialization();
	
	loginpage = new LoginPage();
		
	homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	homepage = new HomePage();
	testutil = new TestUtil();
	pp= new UpcomingPatientsPage();
	AddnewClinic = new ClinincPgae();
	
	}
	
	



@Test( priority =1)

public void UpcomingPatient () throws InterruptedException, AWTException{

	homepage.clickonUpcomingPatientslink();
	
	
    pp.upcomingpatient();


}

@AfterMethod

public void tearDown(){
	
	
	driver.quit();
}

}


