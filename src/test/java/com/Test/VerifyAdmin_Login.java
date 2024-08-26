package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyAdmin_Login extends BaseClass {
	
	public static LoginPom login;
	
	@Test
	public void ValidateAdmin_LoginWithValidCredentials() {
		
		login =PageFactory.initElements(driver, LoginPom.class);
		
		Library.custom_Sendkeys(login.getUsername(), config.getAdminUsername(), "username");
		Library.custom_Sendkeys(login.getPassword(), config.getAdminPassword(), "password");
		Library.custom_Click(login.getSubmitBtn(), "loginbtn");
		Library.customGettitle(driver);
		Library.hardAssert(Library.customGettitle(driver), config.getAdminTitle());
		
		
	}

}
