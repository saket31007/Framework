package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	//import library ExtentReport from aventstack
	//will use below mentioned class
	//ExtentSparkReport
	//ExtentReports
	//created constructor of the class
	public static ExtentReports extent;
	public static ExtentReports getReport() {
	
	String path = "C:\\Users\\saket\\eclipse-workspace\\Framework\\Reports\\index.html";
	
	
	ExtentSparkReporter rp = new ExtentSparkReporter(path);
	rp.config().setDocumentTitle("Test Report");
	rp.config().setReportName("ReMeDi Web Application");
	rp.config().setTheme(Theme.DARK);
	
	
    extent = new ExtentReports();
	extent.attachReporter(rp);
	extent.setSystemInfo("Project Name", "ReMeDi");
	extent.setSystemInfo("Browser", "Chrome");
	extent.setSystemInfo("Build_Version", "4.1.6");
	extent.setSystemInfo("QA", "Saket Barmate");
	return extent;
	
	
	
	}
	

}

