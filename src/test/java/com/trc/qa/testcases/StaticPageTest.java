package com.trc.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.CampaignStagesPage;

import com.trc.qa.pages.HomePage;

import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.PatientsPage;
import com.trc.qa.pages.StaticPage;
import com.trc.qa.util.TestUtil;

public class StaticPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	PatientsPage pp;
	StaticPage staticPage;
	
	 
	public StaticPageTest(){
		
		super();
	}
	
	
@BeforeMethod
	
	public void setUp(){
		
	intialization();
	
	loginpage = new LoginPage();
		
	homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	homepage = new HomePage();
	testutil = new TestUtil();
	staticPage= new StaticPage();
	
	
	}
	
	
@Test(priority=1)
public void EditStaticpage() throws InterruptedException
{
	homepage.clickonStaticPageLink();
	staticPage.StaticPageEdit();
	
}



@AfterMethod
public void tearDown(){
	driver.close();
}
}

