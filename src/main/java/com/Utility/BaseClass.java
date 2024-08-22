package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;




public class BaseClass {
	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	
	@SuppressWarnings("deprecation")
	
	@BeforeSuite
    public void beforeSuite() throws Exception {
		 config = new ConfigDataProvider();
		 excel =new ExcelDataProvider();
		 
		
	}
	
	@BeforeMethod
	@Parameters({"Env"})
	
	public void setup(String Env) {
		
		if(Env.equalsIgnoreCase(config.getStageUrl())) {
		
		 driver = new ChromeDriver();
		 //To access the below mentioned url, I will use config properties file
		//driver.get("https://s3test2.remedi.co.in/RemediPRMS/pages/common/login.jsp");
		 //below is the implementation of the code
		 driver.get(config.getStageUrl());
		 //if live url need to access then
		 //driver.get(config.getLiveUrl());
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
//		
		else if (Env.equalsIgnoreCase(config.getLiveUrl())) {
			driver = new ChromeDriver();
			driver.get(config.getLiveUrl());
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
			}
	
	
	
	//close session
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
