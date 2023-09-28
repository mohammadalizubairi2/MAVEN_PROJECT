package com.learnReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RedIffLoginTest {
	
	
	public WebDriver driver;
	public SoftAssert softAssert = new SoftAssert();
	
	
	@BeforeMethod
	@Parameters ({ "Browser", "url"}) 
	
	public void openBrowser(String Browser ) {

		if (Browser.equals("chrome")){driver = new ChromeDriver();}
		driver.manage().window().maximize();
	}
		@Test (priority = 1)
		
		public void enterURL(String url) {
		driver.get(url);}

	
	
	@Test (priority = 2)
	@Parameters ({"username", "password"})
	public void loginRedIffMailTest(String username, String password) {
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();}

		
		
		
	
@AfterMethod
public void tearDown() {driver.quit();}}


