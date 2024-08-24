package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	
	public static ExtentTest test;
	public static SoftAssert soft;
	public static void custom_Sendkeys(WebElement element , String value , String fieldname) {
	   
		element.sendKeys(value);
	}
	
	public static void custom_Click(WebElement element, String fieldname) {
		
		element.click();
	}

	public static void cutom_handle_dropdown(WebElement element, String text, String filedname) {
		
		Select s= new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static String customGettitle(WebDriver driver) {
	
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    return title;
	}
	
	public static void hardAssert(String actual , String expected) {
		Assert.assertEquals(actual, expected);
	}
	
	public static void customSoftAssert(String actual , String expected) {
	    soft = new SoftAssert();
		soft.assertEquals(actual, expected);

	}
	
   public static void customActionsdoubleClick(WebDriver driver){
	   
	   Actions act = new Actions(driver);
	   
	   act.doubleClick();
   }
	
	
	
	
	//add more custom methods
	//actions move to element
	//drag and drop
	//copy paste using --key 
	//assert and hard assert for string
	//child window handling 
	//screenshot
	//double click
   // context click
}

