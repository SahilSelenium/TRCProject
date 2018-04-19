package com.trc.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.Physician;
import com.trc.qa.pages.ReferralPatientsPage;
import com.trc.qa.util.TestUtil;

public class PhysicianPagetest extends TestBase {

	
HomePage homepage;
	
	LoginPage login;
	ReferralPatientsPage Rpp;
	TestUtil testutil;
	Physician physician;
	String sheetName="Physician";
	public PhysicianPagetest(){
		super();
	}
	@BeforeMethod
public void Setup(){
	
	intialization();	
		
	
		Rpp = new ReferralPatientsPage();
		login = new LoginPage();
		
		homepage = login.Login(prop.getProperty("username"), prop.getProperty("password"));
		
		physician = new Physician();
		
		testutil = new TestUtil();
}
	
	
	@DataProvider
	public Object[][] TestDataphy() {
	Object data[][]=TestUtil.getTestData(sheetName);



	return data;

	}



@Test(priority =1 ,dataProvider ="TestDataphy")
public void addnewphysician(String fname,String mname,String Lname,String Emailid,String hphone,String Mphone,String EmName,String Emphone,String Add1,String add2,String city,String zip ) throws InterruptedException{
	homepage.ClickonPhysicianslink();
	
	physician.AddnewPhysician(fname, mname, Lname, Emailid, hphone, Mphone, EmName, Emphone, Add1, add2, city, zip);
}

@Test(priority =2 ,dataProvider ="TestDataphy")
public void addnewphysicianvalidations(String fname,String mname,String Lname,String Emailid,String hphone,String Mphone,String EmName,String Emphone,String Add1,String add2,String city,String zip ) throws InterruptedException{
	homepage.ClickonPhysicianslink();
	
	physician.AddnewPhysicianvalidation(fname, mname, Lname, Emailid, hphone, Mphone, EmName, Emphone, Add1, add2, city, zip);
}
}
