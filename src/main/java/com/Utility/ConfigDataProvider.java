package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() throws Exception {
		//load the config properties from the below mentioned code
		String filepath ="C:\\Users\\NEURO\\eclipse-workspace\\Framework\\Config\\Config.Properties";
		File src = new File(filepath);
		FileInputStream fis = new FileInputStream(src);
		pro =new Properties();
		pro.load(fis);
	
		
		
		
	}
	//explain declaration, to get the data from key of staging_URL	
	public String getStageUrl() {
		
		return pro.getProperty("Staging_Url");
		
		
	}
	
	public String getLiveUrl() {
		return pro.getProperty("Live_Url");
		
		
	}
	
	public String getStageUsername() {
		return pro.getProperty("Staging_Username");
		
	}
	
	public String getStagepassword() {
		return pro.getProperty("Staging_Password");
		
		}
	public String getExpectedTitle() {
		return pro.getProperty("Title");
	}
	
}
