package com.trc.qa.pages;



	import java.util.List;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.trc.qa.base.TestBase;
import com.trc.qa.util.TestUtil;

	public class SystemEmailTemplatePage  extends TestBase {
		
		
		

		TestUtil test = new TestUtil();
		
		@FindBy(xpath="//*[@id='grdSystemEmailTemplates']/div[1]/a")
		WebElement AddnewTemplate;
		
		@FindBy(xpath="html/body/div[12]/div[2]/div/div[1]/div[1]/div[2]/span/span/span[2]/span")
		WebElement title;
		
		@FindBy(xpath=".//*[@id='TypeId_listbox']/li[3]")
		WebElement Select;
		
		@FindBy(id="FromName")
		WebElement FromName;
		
		@FindBy(id="FromAddress")
		WebElement FromAddres;
		
		@FindBy(id="Subject")
		WebElement Subjects;
		
		@FindBy(xpath="//iframe")
		WebElement Message;
		
		@FindBy(xpath="//tr[1]/td[5]/a[1]")
		WebElement Edit;
		
		@FindBy(xpath="//tr[1]/td[5]/a[2]")
		WebElement Delete;
		
		@FindBy(linkText="Update")
		WebElement Update;
		
		@FindBy(linkText="Cancel")
		WebElement Cancel;
		
		public SystemEmailTemplatePage(){
			
			PageFactory.initElements(driver, this);
		}


		public void AddSystemTemplate( String NAME ,String FromNAme , String FromAddress , String Subject , String Notes) throws InterruptedException    {
			
			    
			AddnewTemplate.click();
			Thread.sleep(3000);
			title.click();
			Thread.sleep(3000);
			Select.click();
			
			test.waitforElementPresent(FromName);
			
			FromName.sendKeys(FromNAme);
			test.waitforElementPresent(FromAddres);
			FromAddres.sendKeys(FromAddress);
			Subjects.sendKeys(Subject);
			
			
			Message.click();
			Message.sendKeys(Notes);
			
			Cancel.click();
		    
			  
		    //Update.click();
		}
		
		public void EditTemplate(String NAME, String FromNAme , String FromAddress , String Subject ,String Notes)    {
			
		    
			Edit.click();
			
			test.waitforElementPresent(FromName);
			
			FromAddres.clear();
			
			FromAddres.sendKeys(FromAddress);
			Subjects.clear();
			Subjects.sendKeys(Subject);
			
			
			Message.click();
			Message.sendKeys(Notes);
		
			
		    
			  
		    Update.click();
		}	
		
		
	public void Templatedelete() throws InterruptedException {
			
		test.waitforElementPresent(Delete);
		
//			Delete.click();
//			Thread.sleep(3000);
//			Alert alt = driver.switchTo().alert();
//			Thread.sleep(2000);
//			alt.accept();
		
		
		
			
		    
			  
		   
		}	
		
		


}