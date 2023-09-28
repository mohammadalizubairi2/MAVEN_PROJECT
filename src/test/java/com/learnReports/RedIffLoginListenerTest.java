											package com.learnReports;
//--------------------------------------------------------------------------------------------------------------------- 
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//----------------------------------------------------------------------------------------------------------------------

	@Listeners(MyListener.class)              //LISTENERS ADDED

	public class RedIffLoginListenerTest {    
	
	
	public WebDriver driver;
	public SoftAssert softAssert = new SoftAssert();
	
	
						@BeforeMethod

	
	public void openBrowser( ) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");}





						@Test(priority = 1)
	public void clickOnLogin() {driver.findElement(By.className("signin")).click();}
	
						@Test(priority = 2)
	public void EnterCredentials() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
	}
	
						@Test(priority = 3) 
	public void clickOnSignIn() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
	    Assert.fail();

	
	}
						@Test(priority = 4, dependsOnMethods = "clickOnSignIn")
	public void clickOnLogout() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();
	
	}
						@Test(priority = 5)
	public void clickOnRidIffHome() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]"));
		
	
	}
		
		
	
						@AfterMethod
   public void tearDown() 
	   {driver.quit();

}}
