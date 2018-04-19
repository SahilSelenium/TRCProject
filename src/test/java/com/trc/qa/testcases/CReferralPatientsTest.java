
package com.trc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.ReferralPatientsPage;
import com.trc.qa.util.TestUtil;

public class CReferralPatientsTest extends TestBase {
    
	
	HomePage homepage;
	
	LoginPage login;
	ReferralPatientsPage Rpp;
	TestUtil testutil;
	public CReferralPatientsTest(){
		super();
	}
	@BeforeMethod
public void Setup(){
	
	intialization();	
		
	
		Rpp = new ReferralPatientsPage();
		login = new LoginPage();
		
		homepage = login.Login(prop.getProperty("username1"), prop.getProperty("password"));
		
		testutil = new TestUtil();
}
	
@Test(priority=1)
public void search() throws InterruptedException{
	
	homepage.clickonReferralPatientslink();
	
	Rpp.searchpatientWithName();
}

@Test(priority=2)
public void downloadpdf() throws Throwable{
	
	homepage.clickonReferralPatientslink();
	Rpp.downloadPDF();
}


@Test(priority=3)
public void selectBootstrapdropdown() throws Throwable{
	
	homepage.clickonReferralPatientslink();
	Rpp.selectBootstrapdropdown();
}

@AfterMethod
public void teardown(){
	driver.close();
}
}
