package com.trc.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trc.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public static String TESTDATA_SHEET_PATH ="D:\\Sahil_workspace\\TrcTest\\src\\main\\java\\com\\crm\\qa\\testdata\\TestDataTRC.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	

	
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		
		
		
		Object[][] data = new Object[1][sheet.getRow(0).getLastCellNum()];
		
		System.out.println(sheet.getLastRowNum() + "--------" +sheet.getRow(0).getLastCellNum());
		
		try{
		                      
		for (int i =0 ; i < 1; i++) {
			
			
			                         
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			 System.out.println(data[i][k]);
		    			
			
		}
	
		break;	
		}
	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return data;
	}

	

	public static Object[][] getTestData1(String sheetName1) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName1);
		
		
		
		Object[][] data1 = new Object[1][sheet.getRow(0).getLastCellNum()];
		
		System.out.println(sheet.getLastRowNum() + "--------" +sheet.getRow(0).getLastCellNum());
		
		try{
		                      
		for (int i =0 ; i < 1; i++) {
			
			
			                         
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				
				data1[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			 System.out.println(data1[i][k]);
		    			
			
		}
	
		break;	
		}
	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return data1;
	}


	
	
	
	
	
	
	
	public void waitForPageToLoad(){
		driver.manage().timeouts().
		               implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	
	
	
	
	
	public void waitforElementPresent(WebElement wb){
	 new WebDriverWait(driver, 20).ignoring(StaleElementReferenceException.class)
	   .until(ExpectedConditions.elementToBeClickable(wb));
	 wb.click();
		
	}
	
	
	public void ScrollDown(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,490)", "");
			
		}
	
	
	
	
	
	
	
	
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		
		//FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		
		}
	

	

}
	
	


