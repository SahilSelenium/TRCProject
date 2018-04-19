package com.trc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.ManageUsersPage;
import com.trc.qa.util.TestUtil;

public class ManageUsersTest extends TestBase {
    TestUtil testutil;
	LoginPage loginpage;
	ManageUsersPage MUP;
	HomePage homepage;
	

	public ManageUsersTest(){
		super();
		
	}
	
	@BeforeMethod
	public void Setup(){
		
		intialization();
	
		homepage =new HomePage();
		testutil = new TestUtil();
		loginpage = new	LoginPage();
		
		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		MUP =new ManageUsersPage();
	}
	

		
	
		
	
	@Test(priority =1)
	public void AddUser() throws Throwable   {
		
		homepage.ClickonManageUsers();
		MUP.Adduser();
	}
	
	

	

		
	
		
	
	@Test(priority =2)
	public void EditUsr( ) throws Throwable   {
		
		homepage.ClickonManageUsers();
		MUP.EditTemplate();
	}
	
	@Test(priority=3)
	public void DeleteUser() throws InterruptedException, Throwable{
		homepage.ClickonManageUsers();
		MUP.Adduser();
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.close();
	}
}








