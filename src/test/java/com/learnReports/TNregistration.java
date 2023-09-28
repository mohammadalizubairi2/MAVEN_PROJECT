package com.learnReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.fileHandling_2ndJuly_2023.ReadingFromExcel;

public class TNregistration {
	
	
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	@BeforeMethod
	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");}
	
	
	@Test(dataProvider = "Red", dataProviderClass = ReadingFromExcel.class)
public void registerAtTutorialsNinjaTest(String lName, String fName, String email,String telephone, String password, String confirmPassword)
	{
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//a[text() = 'Register']")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(fName);
		driver.findElement(By.id("input-lastname")).sendKeys(lName);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confirmPassword);
		
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		}
//	@AfterMethod
//	public void tearDown() {driver.quit();}

}
