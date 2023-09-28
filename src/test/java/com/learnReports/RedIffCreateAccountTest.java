package com.learnReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RedIffCreateAccountTest{
	public WebDriver driver;
	public Select select;
	public SoftAssert softAssert;
	
	@BeforeMethod
	
	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");}
	
        
	
	@Test
	public void createRedIffMailAccountTest() { 
		driver.findElement(By.xpath("//u[text() = 'Create a new account']")).click();
		
		driver.findElement(By.xpath("//input[statrts-with(@name, 'name')]")).sendKeys("Selenium Panda");
		driver.findElement(By.xpath("//input[statrts-with(@name, 'login')]")).sendKeys("selenium544");
		driver.findElement(By.xpath("//input[@class = 'btn_checkavail']")).click();
		String actualAvailabilityMessage = driver.findElement(By.xpath("//div[@id = 'check_availability']")).getText();
		String expectedAvailabilityMessage = "Yippie! The ID you've chosen is available.";
		softAssert = new SoftAssert();
		softAssert.assertTrue(actualAvailabilityMessage.contains(expectedAvailabilityMessage));
		
		driver.findElement(By.xpath("//input[starts-with(@name, 'passwd')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[starts-with(@name, 'confirm_passwd')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[starts-with(@name, 'altemail')]")).sendKeys("seleniumpanda1@rediffmail.com");
		driver.findElement(By.xpath("//input[starts-with(@name, 'mobno')]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[starts-with(@name, 'mobno')]")).sendKeys("9876543210");
		select = new Select(driver.findElement(By.xpath("//select[statrts-with(@name, 'DOB_Day')]")));
		select.selectByVisibleText("03");
		
		select = new Select(driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Month')]")));
		select.selectByVisibleText("MAR");
		
		select = new Select(driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Year')]")));
		select.selectByVisibleText("2003");
		driver.findElement(By.xpath("//input[@value = 'f']")).click();
		
		select = new Select(driver.findElement(By.id("country")));
		select.selectByVisibleText("Peru");
		
		select = new Select(driver.findElement(By.xpath("//select[starts-with(@name, 'city')]")));
		select.selectByVisibleText("Surat");
		
		driver.findElement(By.xpath("//input[@class = 'captcha']")).sendKeys("EETTA");
		driver.findElement(By.xpath("//input[@id = 'Register']")).click();
		
		String actualFailedRegistrationMessage = driver.findElement(By.className("errbody")).getText();
		String expectedFailedRegistrationMessage = "Sorry! We'll not be able to register you right now.";
		
		softAssert.assertTrue(actualFailedRegistrationMessage.contains(expectedFailedRegistrationMessage));
		
		
		
		
		
		
		
		
	}
	@AfterMethod
	public void tearDown() {driver.quit();
	softAssert.assertAll();}
}
