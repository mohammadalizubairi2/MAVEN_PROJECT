package com.fileHandling_2ndJuly_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RedIffLoginExcel {
	
			public WebDriver driver;
			public SoftAssert softAssert = new SoftAssert();
	
	
	@Test (dataProvider = "Red", dataProviderClass = ReadingFromExcel.class)

	public void loginRedIffMailTest(String username, String password) {
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();}	
	


@Test (retryAnalyzer = MyRetry.class)

public void loginRedIffMailTest2() {
	driver = new ChromeDriver();		
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda2@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	driver.findElement(By.className("signinbtn")).click();
	Assert.fail();}	

@AfterMethod
public void tearDown() {driver.quit();}}



