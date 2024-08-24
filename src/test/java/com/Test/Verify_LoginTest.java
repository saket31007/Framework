package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Verify_LoginTest extends BaseClass {
	
	
	
	@Test
	public void verify_loginwithValidCredentials() {
		//loading/initialitopn the webelemnts into the testclass from loginpom class using pagefactory class
		
		LoginPom login =PageFactory.initElements(driver, LoginPom.class);
		
//		login.getUsername().sendKeys(excel.getStringData("LoginSheet", 0, 0));
//		login.getPassword().sendKeys(config.getStagepassword());
//		login.getSubmitBtn().click();
		
		//below mentioned lines of code do the same work as above, I have created the common method in the library class and make it static.
	    // the purpose of this to keep the code in more readable format and also long lines of code can be wrapped into only one line
		
		Library.custom_Sendkeys(login.getUsername(), excel.getStringData("Loginsheet", 0, 0), "username");
		Library.custom_Sendkeys(login.getPassword(), config.getStagepassword(), "password");
		Library.custom_Click(login.getSubmitBtn(), "loginbutton");
		//Library.customGettitle(driver);
		Library.hardAssert(Library.customGettitle(driver), config.getExpectedTitle());
		//Library.customSoftAssert(Library.customGettitle(driver), config.getExpectedTitle());
		//System.out.println("reached to next step due soft assert");
		//Library.soft.assertAll();
		}
	

}
