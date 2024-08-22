package com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


//implementation of extent reports will be done here in the listners class

	//Listners class implements interface ITestListner 
	// right click on listner class over goto source and select overide implement mathods
    // select total 5 methods onteststart,ontestsuccess,ontestskipped,ontestfinished

public class Listeners extends BaseClass implements ITestListener {

	
	ExtentReports extent = ExtentReportGenerator.getReport();
	//to attach multiple test cases in one report we are using ThreadLocal
	ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		//will handover the below refrence to the library class ExtentTest test also make it public static
	Library.test= extent.createTest(result.getTestClass().getName()+"=="+ result.getMethod().getMethodName());
	//ExtentTest refrence of ThreadLocal, it will attach mutiple testcases in the report
	extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		
		extenttest.get().log(Status.PASS, "Test Case Pass");
		extenttest.get().addScreenCaptureFromBase64String(captureScreenshot(), "Test case pass screenshot");
		
	}

	public void onTestFailure(ITestResult result) {
		
		extenttest.get().log(Status.FAIL, "Test Case Fail");
		extenttest.get().addScreenCaptureFromBase64String(captureScreenshot(), "Test case fail screenshot");
		
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test Case Skip");
	}

	public void onFinish(ITestContext context) {
		
		extent.flush();
		
	}
	
	public String captureScreenshot() {
		
		String file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		return file;
	}
	
	
	
	
	

}
