package com.trc.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trc.qa.base.TestBase;

public class BabyGalleryPage extends TestBase {

	
	
	
	
	@FindBy(id="btnNewBabyPhoto")
	WebElement btnNewBabyPhoto;
	
	@FindBy(id="Name")
	WebElement Name;

	
	@FindBy(id="BirthDate")
	WebElement BirthDate;
		
	@FindBy(xpath="//*[@id='files' or name ='files']")
	WebElement Browse;
	
	
	
	@FindBy(id="btnSave")
	WebElement Savebutton;
	
	@FindBy(xpath="//*[@id='listView']/div[1]/div/div/a[1]")
	WebElement Edit;
	
	@FindBy(xpath="//*[@id='listView']/div[1]/div/div/a[2]")
	WebElement Delete;
	

	
	
	public  BabyGalleryPage(){
		
		PageFactory.initElements(driver, this);
	}


	public void AddNewBabyPhoto() throws AWTException, InterruptedException{
		
		btnNewBabyPhoto.click();
		
		
		Thread.sleep(3000);
		
		
		Name.sendKeys("Sarah");
	    
		BirthDate.sendKeys("03/07/2017");
		Thread.sleep(2000);
		Browse.click();
		
		Thread.sleep(3000);

		StringSelection ss = new StringSelection("cute_haircut_baby_girl-wide.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
	
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 Thread.sleep(3000);
		 
		 Savebutton.click();
	}
	
	public void EditbabygalleryPage()    {
		
	    Edit.click();
	    
        Name.clear();
		
          Name.sendKeys("Nubia Dwan");
          BirthDate.clear();
		BirthDate.sendKeys("8/29/2014");
		
		
		
		Savebutton.click();
	
		
	    
		  
	    
	}	
	
	
public void Delete() throws InterruptedException, AWTException {
		
	Delete.click();
	
	Thread.sleep(3000);
	Alert alt = driver.switchTo().alert();
	
	alt.accept();
	}	
	
}





