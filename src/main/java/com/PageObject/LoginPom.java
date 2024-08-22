package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	WebDriver driver ; //instance variable
	
	//below webelements need to return in the verify logintest

	@FindBy(how=How.XPATH, using= "//input[@id='username']")
	private WebElement username;
	
	@FindBy(how=How.XPATH, using= "//input[@id='password']")
	private WebElement password;
	
	@FindBy(how=How.XPATH, using= "//input[@id='submitBtn']")
	private WebElement submitBtn;
	
	
	//created constructor
	
	public LoginPom(WebDriver driver) {
		
		this.driver=driver;
	}
	//Encapsulation
	
	//created getting for the for Webelement 
		public WebElement getUsername() {
			return username;
		}


		public WebElement getPassword() {
			return password;
		}

		public WebElement getSubmitBtn() {
			return submitBtn;
		}
}
