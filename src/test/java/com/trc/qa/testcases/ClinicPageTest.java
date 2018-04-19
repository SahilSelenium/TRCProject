package com.trc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.ClinincPgae;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.PatientsPage;
import com.trc.qa.util.TestUtil;

public class ClinicPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	PatientsPage pp;
	ClinincPgae AddnewClinic;
	String sheetName="AddnewClinic";
	
	public ClinicPageTest(){
		
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
	AddnewClinic = new ClinincPgae();
	}
	
	
@DataProvider
public Object[][] TestData() {
Object data[][]=TestUtil.getTestData(sheetName);



return data;

}


@Test( priority =1 ,dataProvider="TestData")

public void ClinicPage(String First , 
String phone,String Address,String Addresssecond, String CityName,String Zip, 
String notes) throws InterruptedException{

	homepage.Clickoncliniclink();
	
   AddnewClinic.CreateNewClinic(First, phone, Address, Addresssecond, CityName,Zip, notes);
  
 

}


@Test( priority =2 ,dataProvider="TestData")

public void ClinicPageedit(String First , 
String phone,String Address,String Addresssecond, String CityName,String Zip, 
String notes) throws InterruptedException{

	
	
	homepage.Clickoncliniclink();
	
   AddnewClinic.CreateNewClinicEdit(First, phone, Address, Addresssecond, CityName, Zip, notes);
  
 

}



@Test( priority =3)

public void Clinicdelete() throws InterruptedException{

	homepage.Clickoncliniclink();
	
	
   AddnewClinic.CreateNewClinicDelete();
  
 

}

@AfterMethod

public void tearDown(){
	
	
	driver.quit();
}

}
