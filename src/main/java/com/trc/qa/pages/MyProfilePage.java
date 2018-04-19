package com.trc.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trc.qa.base.TestBase;

public class MyProfilePage  extends TestBase {

	
	
	
	
	@FindBy(id="FirstName")
	WebElement Name;
	
	@FindBy(id="LastName")
	WebElement LastName;

	
	@FindBy(id="file")
	WebElement Browse;
		
	@FindBy(id="btnUpload")
	WebElement Upload;
	
	
	
	@FindBy(id="btnSave")
	WebElement Savebutton;
	
	

	
	
	public  MyProfilePage(){
		
		PageFactory.initElements(driver, this);
	}


	public void ChangeMyProfilePage(){
		
		Name.clear();
		
		Name.sendKeys("Simon");
		    
		LastName.clear();
		
		LastName.sendKeys("will");
		
		Savebutton.click();
		
		
	    
		  
	    
	}
	
	public void EditMyProfilePage()    {
		
	    
        Name.clear();
		
		Name.sendKeys("Chris");
		   
		LastName.clear();
		
		LastName.sendKeys("Kambala");
		
		Savebutton.click();
	
		
	    
		  
	    
	}	
	
	
public void UploadProfile() throws InterruptedException, AWTException {
		
	    
     	Browse.click();
     	
     	StringSelection ss = new StringSelection("L&L.png");
     	
     	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	
	
     	Robot robot = new Robot();
     	robot.keyPress(KeyEvent.VK_CONTROL);
     	robot.keyPress(KeyEvent.VK_V);
     	robot.keyRelease(KeyEvent.VK_CONTROL);
     	robot.keyRelease(KeyEvent.VK_V);
     	
     	robot.keyPress(KeyEvent.VK_ENTER);
     	robot.keyRelease(KeyEvent.VK_ENTER); 
		 Thread.sleep(3000);
     	Upload.click();
	   
	}	
	
}





