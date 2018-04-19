package com.trc.qa.pages;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trc.qa.base.TestBase;
import com.trc.qa.util.TestUtil;

public class StaticPage  extends TestBase {
	TestUtil ne = new TestUtil();
	
	@FindBy(id="btnSearch")
	WebElement Searchbutton;

	
	
	@FindBy(xpath="//tr[1]/td[4]/a")
	WebElement Edit;
	
	

	@FindBy(id="btnAdd")
	WebElement btnAdd;
	
	@FindBy(id="btnClose")
	WebElement btnClose;
	
	
	public StaticPage(){
		
		PageFactory.initElements(driver, this);
	}


	public void StaticPageEdit( ) throws InterruptedException  {
		
		     Edit.click();
		
		 driver.findElement(By.xpath(".//form/div[1]/div[1]/div/span/span/span[1]")).click();
		  Thread.sleep(3000);
		  List<WebElement>list =  driver.findElements(By.xpath(".//*[@id='PageName-list']"));
		  
		  for(WebElement ele: list)
		  {
			  if(ele.getAttribute("innerHTML").contains("Dr.Wilson"));
	{
		 
		 ele.click();
		 break;
		 
	}
	
		  }
		  
		  btnAdd.click();
		  
	}
	

}