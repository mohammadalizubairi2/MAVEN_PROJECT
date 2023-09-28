package com.automationCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MoreCommands {
	static Select select;

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit is smart wait. Automation will move on when everything is done. Explicit is exact wait mean even if the page has been load the automation will still wait for the specified time.
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.tutorialsninja.com/demo");
//		select = new Select(driver.findElement(By.id("tools")));
//		select.selectByVisibleText("Cucumber");
//		select = new Select(driver.findElement(By.id("tools1")));
//		select.selectByVisibleText("Cucumber");
//	driver.findElement(By.id("tools1")).sendKeys("TestNG");
		
	
	driver.findElement(By.xpath("//span[@class = 'hidden-xs hidden-sm hidden-md']/preceding::a[@title = 'My Account'")).click();
//	driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Panda");
//	
//	driver.findElement(By.xpath("//input[@name = 'reg_email__']"))             .sendKeys("seleniumpanda111@gmail.com");
//	driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("seleniumpanda111@gmail.com");
//	
//	driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("Selenium@123");
//	driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("Selenium@123");
//	select = new Select(driver.findElement(By.id("month")));
//	select.selectByVisibleText("Aug");
//	select = new Select(driver.findElement(By.id("day")));
//	select.selectByVisibleText("10");	select = new Select(driver.findElement(By.id("year")));		select.selectByVisibleText("1983");
//		
	}
}
