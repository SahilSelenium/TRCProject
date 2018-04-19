package com.trc.qa.pages;




import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trc.qa.base.TestBase;
import com.trc.qa.util.TestUtil;

public class PPhysicianMyAvailability  extends TestBase {
	TestUtil ne = new TestUtil();
	
	@FindBy(id="btnNewAvailability")
	WebElement btnNewAvailability;

	
	
	@FindBy(xpath="//tr[1]/td[5]/a[1]")
	WebElement Edit;
	
	@FindBy(xpath="//tr[1]/td[5]/a[2]")
	WebElement Delete;

	@FindBy(id="btnUpdateAvailability")
	WebElement Update;
	
	@FindBy(id="btnNewAvailability")
	WebElement Add;
	
	@FindBy(xpath="//*[@id='updateAvailabilityForm']/div[1]/div[1]/div[1]/div/span/span/span[1]")
	WebElement
	Bootstrapdown1;
	
	@FindBy(xpath=".//*[@id='updateAvailabilityForm']/div[1]/div[1]/div[2]/div/span/span/span[1]")
	WebElement
	Bootstrapdown2;
	
	
	@FindBy(xpath=".//*[@id='updateAvailabilityForm']/div[1]/div[2]/div[1]/div/div[1]/span/span/span[1]")
	WebElement
	Bootstrapdown3;
	
	
	
	@FindBy(xpath=".//*[@id='updateAvailabilityForm']/div[1]/div[2]/div[1]/div/div[2]/span/span/span[1]")
	WebElement
	Bootstrapdown4;
	
	
	
	public PPhysicianMyAvailability(){
		
		PageFactory.initElements(driver, this);
	}


	public void AvaliablityEdit( ) throws InterruptedException  {
		
//		ne.waitforElementPresent(Edit);
//		   Edit.click();
//		   ne.waitforElementPresent(Bootstrapdown1);
//		   Bootstrapdown1.click();
//			Thread.sleep(3000);
//			List<WebElement>list =  driver.findElements(By.xpath(".//*[@id='AppointmentTypeId-list']")) ;
//			
//			for (WebElement ele : list )
//			{
//				ele.getAttribute("innerHTML").contains("Surgery Appointment");
//				ele.click();
//				Thread.sleep(3000);
//				
//				
//			}
//			
//	
//	
//	
//			 Bootstrapdown2.click();
//				Thread.sleep(3000);
//				List<WebElement>listt =  driver.findElements(By.xpath(".//*[@id='WeekDay-list']")) ;
//				
//				for (WebElement ele : listt )
//				{
//					ele.getAttribute("innerHTML").contains("Tuesday");
//					ele.click();
//					Thread.sleep(3000);
//					
//					
//				}
//	
//	
//				 Bootstrapdown3.click();
//					Thread.sleep(3000);
//					List<WebElement>lis =  driver.findElements(By.xpath(".//*[@id='StartTimeHrs-list']")) ;
//					
//					for (WebElement ele : lis )
//					{
//						ele.getAttribute("innerHTML").contains("09");
//						ele.click();
//						Thread.sleep(3000);
//						
//						
//					}
//	
//	
//	
//	Update.click();
//	
//	
	}
		
	
	
public void AvaliablityAdd( )  {
		
//		ne.waitforElementPresent(btnNewAvailability);
//		btnNewAvailability.click();
//		ne.waitforElementPresent(btnNewAvailability);
//		   Bootstrapdown1.click();
//			Thread.sleep(3000);
//			List<WebElement>list =  driver.findElements(By.xpath(".//*[@id='AppointmentTypeId-list']")) ;
//			
//			for (WebElement ele : list )
//			{
//				ele.getAttribute("innerHTML").contains("Surgery Appointment");
//				ele.click();
//				Thread.sleep(3000);
//				
//				
//			}
//			
//	
//	
//	
//			 Bootstrapdown2.click();
//				Thread.sleep(3000);
//				List<WebElement>listt =  driver.findElements(By.xpath(".//*[@id='WeekDay-list']")) ;
//				
//				for (WebElement ele : listt )
//				{
//					ele.getAttribute("innerHTML").contains("Tuesday");
//					ele.click();
//					Thread.sleep(3000);
//					
//					
//				}
//	
//	
//				 Bootstrapdown3.click();
//					Thread.sleep(3000);
//					List<WebElement>lis =  driver.findElements(By.xpath(".//*[@id='StartTimeHrs-list']")) ;
//					
//					for (WebElement ele : lis )
//					{
//						ele.getAttribute("innerHTML").contains("09");
//						ele.click();
//						Thread.sleep(3000);
//						
//						
//					}
//	
//	
//	
//					Add.click();
//	
//	
	}
//	

public void delete()
{
	Delete.click();
	
	Alert alt = driver.switchTo().alert();
	
	alt.accept();
}
					
				
public void delete1()
{
	
}


}

		  
	
	

