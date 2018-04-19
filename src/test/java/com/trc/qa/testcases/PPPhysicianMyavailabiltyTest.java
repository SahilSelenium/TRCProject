

package com.trc.qa.testcases;
import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trc.qa.base.TestBase;
import com.trc.qa.pages.ClinincPgae;
import com.trc.qa.pages.HomePage;
import com.trc.qa.pages.LoginPage;
import com.trc.qa.pages.PPhysicianMyAvailability;
import com.trc.qa.pages.PatientsPage;
import com.trc.qa.pages.UpcomingPatientsPage;
import com.trc.qa.util.TestUtil;

public class  PPPhysicianMyavailabiltyTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	PPhysicianMyAvailability pp;
	ClinincPgae AddnewClinic;
	String sheetName="AddnewClinic";
	 
	public PPPhysicianMyavailabiltyTest(){
		
		super();
	}
	
	
@BeforeMethod
	
	public void setUp(){
		
	intialization();
	
	loginpage = new LoginPage();
		
	homepage = loginpage.Login(prop.getProperty("username2"), prop.getProperty("password"));
	homepage = new HomePage();
	testutil = new TestUtil();
	pp= new PPhysicianMyAvailability();
	AddnewClinic = new ClinincPgae();
	
	}
	
	



@Test( priority =1)

public void AvaliablityAdd () throws InterruptedException, AWTException{

	homepage.ClickMyavailability();
	
	
    pp.AvaliablityAdd();


}

//@Test( priority =2)

public void AvaliablityEdit () throws InterruptedException, AWTException{

	homepage.ClickMyavailability();
	
	
    pp.AvaliablityEdit();
Thread.sleep(999999999);

}

@Test( priority =3)

public void deleten() throws InterruptedException {

	homepage.ClickMyavailability();
	
	
    pp.delete();


}



@Test( priority =4)

public void delete1 () throws InterruptedException, AWTException{

	
	homepage.ClickMyavailability();
	
   


}
@Test( priority =5)

public void delete2 () throws InterruptedException, AWTException{

	
	homepage.ClickMyavailability();
	
   


}
@Test( priority =6)

public void delete3 () throws InterruptedException, AWTException{

	
	homepage.ClickMyavailability();
	
   


}

@Test( priority =3)

public void delete () throws InterruptedException, AWTException{

	homepage.ClickMyavailability();
	
	
    pp.delete();


}




@AfterMethod

public void tearDown(){
	
	
	driver.close();
}

}


