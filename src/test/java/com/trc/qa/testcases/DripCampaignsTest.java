package com.trc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.DripCampaignsPage;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LeadsPage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.PatientsPage;
import com.trc.qa.util.TestUtil;

public class DripCampaignsTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	PatientsPage pp;
	DripCampaignsPage Drip;;
	
	 
	public DripCampaignsTest(){
		
		super();
	}
	
	
@BeforeMethod
	
	public void setUp(){
		
	intialization();
	
	loginpage = new LoginPage();
		
	homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	homepage = new HomePage();
	testutil = new TestUtil();
	Drip= new DripCampaignsPage();
	
	
	}
	
	
@Test(priority=1)
public void EditDrip()
{
	homepage.clickDripCampiganlink();
	Drip.DripCampaignEdit();
}


@Test(priority=2)
public void DeleteDrip()
{
	homepage.clickDripCampiganlink();
	Drip.DripCampaigDelete();
}

@AfterMethod
public void tearDown(){
	driver.close();
}
}

