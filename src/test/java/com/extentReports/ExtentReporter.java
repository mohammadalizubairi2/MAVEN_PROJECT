package com.extentReports;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.codehaus.plexus.util.Os;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {

	
	public static ExtentReports generateExtentReports() throws Exception {
		//Extent Reports chabi 
	ExtentReports er = new ExtentReports(); 
		//File chabi
	File fileKeyContainingERpath = new File(System.getProperty("user.dir") + "\\test-output\\ExtentReports\\extentReports.html");
	 	//Spark Reporter chabi
	ExtentSparkReporter spark = new ExtentSparkReporter(fileKeyContainingERpath);
		//configure report, theme, report name, document neme, date/time format etc
	spark.config().setTheme(Theme.DARK);
	spark.config().setReportName("TN Automation Result");
	spark.config().setDocumentTitle("TNReports|Automation|Result");
	spark.config().setTimeStampFormat("mm/dd/yyyy hh:mm:ss");
	er.attachReporter(spark);
		//Properties chabi
	Properties prop = new Properties();
		//File Input Stream chabi
	FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\extentReports\\config.properties");
	prop.load(ip);
	
	er.setSystemInfo("Application url",prop.getProperty("url"));
	er.setSystemInfo("Browser",prop.getProperty("browser"));
	er.setSystemInfo("UserName",prop.getProperty("validUserName"));
	er.setSystemInfo("Password",prop.getProperty("password"));
	er.setSystemInfo("Operating System Name",System.getProperty("os.name"));
	er.setSystemInfo("Operating System Version",System.getProperty("os.version"));
	er.setSystemInfo("SDET Name",System.getProperty("user.name"));
	er.setSystemInfo("Java Version",System.getProperty("java.version"));
	er.setSystemInfo("Java Vendor",System.getProperty("java.vendor"));
	
	return er;

}}
