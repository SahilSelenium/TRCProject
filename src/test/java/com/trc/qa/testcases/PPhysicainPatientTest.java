

package com.trc.qa.testcases;


import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.PatientsPage;
import com.trc.qa.util.TestUtil;

public class PPhysicainPatientTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	PatientsPage pp;
	String sheetName="NewPatient";
	String sheetName1="Searchpatient";
	public PPhysicainPatientTest(){
		
		super();
	}
	
	
@BeforeMethod
	
	public void setUp(){
		
	intialization();
	
	loginpage = new LoginPage();
		
	homepage = loginpage.Login(prop.getProperty("username2"), prop.getProperty("password"));
	
	testutil = new TestUtil();
	pp= new PatientsPage();
	
	}
	
	
@DataProvider
public Object[][] TestData() {
Object data[][]=TestUtil.getTestData(sheetName);



return data;

}


@Test( priority =1 ,dataProvider="TestData")

public void createnewPatient(String title ,String First , String Last, String Year,String age,
String Email,String phone,String Address,String Addresssecond, String CityName,String Zip, String countryId,
String StateId, String ClinicID, String PhysicianID) throws InterruptedException{

	homepage.clickonnewPatient();
	
   pp.CreateNewPatient(title, First, Last, Year, age, Email, phone, Address, Addresssecond, CityName, Zip, countryId, StateId, ClinicID, PhysicianID);

  


}

@Test( priority =2)
public void textCheck()
{
	homepage.clickonnewPatient();
	pp.upcomingpatient();
}

@Test( priority =3)
public void Downloadpdf() throws Throwable
{
	homepage.clickonnewPatient();
	pp.downloadPDF();
}


@DataProvider
public Object[][] TestDat() {
Object data[][]=TestUtil.getTestData1(sheetName1);



return data;
}

@Test(priority = 4 ,dataProvider ="TestDat")
public void searchpatient(String Startdate,String Enddate){
	homepage.clickonnewPatient();
	pp.searchpatient(Startdate, Enddate);
}

@Test(priority = 5)
public void searchpatientwithemail() throws InterruptedException{
	homepage.clickonnewPatient();
	pp.searchpatientWithEMail();
}

@Test(priority = 6)
public void searchpatientwithname() throws InterruptedException{
	homepage.clickonnewPatient();
	pp.searchpatientWithName();
}

@AfterMethod

public void tearDown(){
	
	
	driver.quit();
}

}





















