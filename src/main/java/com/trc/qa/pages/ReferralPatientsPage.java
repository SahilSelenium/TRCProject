package com.trc.qa.pages;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.trc.qa.base.TestBase;

public class ReferralPatientsPage extends TestBase{

	@FindBy(id="btnSearch")
	WebElement Searchbutton;

	
	
	@FindBy(id="txtSearchString")
	WebElement SearchWithname;
	
	@FindBy(xpath="//*[text()='Tim']")
	WebElement Tim;
	@FindBy(xpath="//*[text()='Cory']")
	WebElement Cory;
	
	@FindBy(xpath="//*[text()='opher']")
	WebElement opher;
	
	@FindBy(xpath="//*[text()='tonio']")
	WebElement tonio;
	
	@FindBy(xpath="//*[@class='k-button k-button-icontext k-grid-pdf']")
	WebElement Downloadpdf;
	
	@FindBy(xpath="html/body/div[3]/div/div[1]/div/div[2]/div/div[2]/span/span/span[1]")
	WebElement Bootstrapdown;
	
	public ReferralPatientsPage(){
		
		PageFactory.initElements(driver, this);
	}
	
public void downloadPDF() throws Throwable{
	
	Downloadpdf.click();
	
	Thread.sleep(4000);
	  Robot robot = new Robot();  // Robot class throws AWT Exception	
    Thread.sleep(2000); // Thread.sleep throws InterruptedException	

    robot.keyPress(KeyEvent.VK_ENTER);	
    Thread.sleep(2000);
 	robot.keyRelease(KeyEvent.VK_ENTER);
 }	 

public void searchpatientWithName( ) throws InterruptedException {
	
	
	
	SearchWithname.sendKeys("Tim");
	
	Searchbutton.click();
	
	
	
	
boolean flag =	Tim.isDisplayed();


Assert.assertTrue(flag);



	
}

public void selectBootstrapdropdown() throws InterruptedException{
	
	Bootstrapdown.click();
	Thread.sleep(3000);
	List<WebElement>list =  driver.findElements(By.xpath("//*[@id='years-list']")) ;
	
	for (WebElement ele : list )
	{
		ele.getAttribute("innerHTML").contains("3-6");
		ele.click();
		Thread.sleep(3000);
		try{
		boolean flag =	Cory.isDisplayed();

		Assert.assertTrue(flag);
		}
		catch(Exception e)
		{
			boolean flag1 =	opher.isDisplayed();

			Assert.assertTrue(flag1);
		}
		
		
			
			
	}}
		
		
		
		
		public void selectBootstrapdropdown1() throws InterruptedException{
			
			Bootstrapdown.click();
			Thread.sleep(3000);
			List<WebElement>list =  driver.findElements(By.xpath("//*[@id='years-list']")) ;
			
			for (WebElement ele : list )
			{
				ele.getAttribute("innerHTML").contains("3-6");
				ele.click();
				Thread.sleep(3000);
				try{
				
				
				boolean flag3 =	tonio.isDisplayed();

				Assert.assertTrue(flag3);
				}
				catch(Exception d){
					
				
					boolean flag =	Cory.isDisplayed();

					Assert.assertTrue(flag);
				
					
					
				}
	}

	




}}