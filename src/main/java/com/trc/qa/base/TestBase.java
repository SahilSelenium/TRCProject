package com.trc.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.trc.qa.util.TestUtil;



public class TestBase {

	public static WebDriver driver;
	
    public	static Properties prop;  // global variable
	
	public TestBase(){// constructor
		
		try{
			
			prop = new Properties();
			
      FileInputStream ip = new FileInputStream("D:\\Sahil_workspace\\TrcTest\\src\\main\\java\\com\\trc\\qa\\config\\config.properties");
					
					
					
					prop.load(ip);
					
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
	
	


public static void  intialization(){
	
	String browsername = prop.getProperty("browser");
	
	if(browsername.equals("chrome")){
		
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver = new ChromeDriver();
	}
	
	
    else if(browsername.equals("firefox")){
	System.setProperty("webdriver.gecko.driver","D:\\gecko\\geckodriver.exe");
	
	//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	
	driver = new FirefoxDriver();
    }
    
    else if(browsername.equals("ie")){
	System.setProperty("webdriver.ie.driver", "C:\\sjar\\IEDriverSerevr.exe");
	driver = new InternetExplorerDriver();
    }
    
    else if(browsername.equals("Safari")){
	System.setProperty("webdriver.ie.driver", "C:\\sjar\\IEDriverSerevr.exe");
	driver = new InternetExplorerDriver();
}
	
	
	
	
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

    driver.get(prop.getProperty("url"));





	
}


}

















