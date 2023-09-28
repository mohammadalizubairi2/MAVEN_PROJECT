package com.learnReports;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentReporter;


public class MyListener implements ITestListener{
	public ExtentReports extentReport;
	public ExtentTest extentTest;
	
	
	@Override
	public void onStart(ITestContext context) {
		try { /*caries er method -->*/      extentReport = ExtentReporter.generateExtentReports();       } catch (Throwable e) {e.printStackTrace();}
		}

	@Override
	public void onTestStart(ITestResult result) {
		String TestName = result.getName();
		
		extentTest = extentReport.createTest(TestName);
		extentTest.log(Status.INFO,"-> Test Started");
		
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String TestName = result.getName();
		
		extentTest = extentReport.createTest(TestName);
		extentTest.log(Status.PASS,"-> Test PASSED");
		

	}

	@Override
	public void onTestFailure(ITestResult result) {

			extentTest.log(Status.INFO, result.getThrowable());
			extentTest.log(Status.FAIL,"-> Test FAILED");
		
	
	}
	
	
	
	

	@Override
	public void onTestSkipped(ITestResult result) {
		String TestName = result.getName();
		extentTest = extentReport.createTest(TestName);
		extentTest.log(Status.SKIP,"-> Test SKIPPED");
		

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String TestName = result.getName();
		extentTest = extentReport.createTest(TestName);
		extentTest.log(Status.WARNING,"-> Test %PASSED");
		

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String TestName = result.getName();
		System.out.println(TestName + ": TimedOut");

		

	}

	
	
	
	
	
	
	


	@Override
	public void onFinish(ITestContext context) {
		System.out.println( "Operation Ended");
		

	}

}
