package com.testNGLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {
	
	public WebDriver dds;
	@Test
	public void learnActions() {
		dds = new ChromeDriver();
		dds.manage().window().maximize();
		dds.get("https://browserstack.com");
		Actions action = new Actions(dds);
		//dds.findElement(By.xpath("//span[contains(text(), 'Sign in')]")).click();
		
		WebElement getADemoButton = dds.findElement(By.xpath("//div[@class = 'relative'] /preceding::button[1]"));
		action.moveToElement(getADemoButton).perform();
		WebElement signupModalButton = dds.findElement(By.id("signupModalButton"));
		action.moveToElement(signupModalButton).contextClick().perform();
		
		
		
	}

}
