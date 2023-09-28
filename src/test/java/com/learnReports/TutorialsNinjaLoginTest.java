package com.learnReports;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TutorialsNinjaLoginTest {
	//Create the Object of the properties file.
	// Step2. in order to read data from the properties file FileInputSteam class Object has to be created.
	//Location of the properties file = right click on properties file and copy the location.
	//C:\Users\ktwo3\eclipse-workspace\MAVEN_PROJECT\src\test\java\com\fileHandling_2ndJuly_2023\tutorialsNinja.properties
	public Properties prop= new Properties();
public WebDriver driver;
public SoftAssert softAssert = new SoftAssert();

@BeforeMethod
public void openBrowser() {

	driver = new ChromeDriver();
	driver.manage().window().maximize();}
//F I S object gets the address of the properties file
//Properties object .load method gets FIS object in.
//Properties object .property method gives the value of the property.
	

@Test
public void loginTN() throws IOException, InterruptedException {
	
	FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\fileHandling_2ndJuly_2023\\tutorialsNinja.properties");
	prop.load(ip);


	driver.get(prop.getProperty("url"));
	
	Thread.sleep(4000);
	
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();

	driver.findElement(By.id("input-email")).sendKeys((prop.getProperty("validUsername")));
	driver.findElement(By.id("input-password")).sendKeys((prop.getProperty("validPassword")));
	
	driver.findElement(By.className("btn btn-primary")).click();
	Thread.sleep(4000);
	}
@AfterMethod
public void tearDown() {driver.quit();}


	
	
	
	
	
	
	
	
	

}
