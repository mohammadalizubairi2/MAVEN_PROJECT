package com.testNGLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnXpath {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");}
	
	@Test(priority = 1)
	public void clickOnCreateAccount() throws InterruptedException  {
		driver.findElement(By.cssSelector("div#desktop-menu>form+ul>li:nth-child(11)>a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#login1")).sendKeys("SeleniumPanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		
	
	
	
	}
	
//	@AfterMethod
//	public void tearDown() {driver.quit();}

}
