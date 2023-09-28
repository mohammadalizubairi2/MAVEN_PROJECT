 package com.testNGLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	@BeforeMethod
	public void beforeMethod() {
	
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	driver.findElement(By.xpath("//span[text()= 'My Account']")).click();
	
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.xpath("//input[@class= 'btn btn-primary']")).click();}
	
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void softAsserts() throws Exception {
		
		
		
		
		
		WebElement actual = driver.findElement(By.xpath("//input[@id = 'input-password']/following-sibling::div[1]"));
		
		
		String expected = "Password must be between 4 and 20 characters!";
		
		softAssert.assertTrue(driver.findElement(By.xpath("//input[@id = 'input-password']/following-sibling::div[1]")).isDisplayed());
		softAssert.assertAll();
		
		
	}
	@AfterMethod
	public void tearDown() {driver.quit();}

}
