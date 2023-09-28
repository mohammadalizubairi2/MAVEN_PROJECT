package com.fileHandling_2ndJuly_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ReadingFromPropertiesFile {
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	@BeforeMethod
	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");}

	@Test
	public void registerAtTutorialsNinjaTest() {
		driver.findElement(By.className("hidden-xs hidden-sm hidden-md")).click();
		driver.findElement(By.xpath("//a[text()= 'Login']")).click();

		driver.findElement(By.id("input-email")).sendKeys("Seleniumpanda11@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		
		driver.findElement(By.className("btn btn-primary")).click();
		}
	@AfterMethod
	public void tearDown() {driver.quit();}

}
