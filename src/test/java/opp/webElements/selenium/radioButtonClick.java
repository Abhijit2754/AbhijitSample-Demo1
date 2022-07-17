package opp.webElements.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioButtonClick {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void methodConfig()
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
	}
	
	@Test(priority = 0)
	public void fName()
	{
		WebElement fname = driver.findElement(By.id("firstName"));
		
		fname.sendKeys("Abhijit");
	}
	
	@Test(priority = 1)
	public void lName()
	{
		WebElement lname = driver.findElement(By.id("lastName"));
		
		lname.sendKeys("Paithane");
	}
	
	@Test(priority = 2)
	public void radioButton()
	{	
		WebElement ele = driver.findElement(By.id("gender-radio-2"));
		
		System.out.println("Value is : "+ele.getAttribute("id"));	
	}
	
	@Test(priority = 3)
	public void mobileNumberTextBox()
	{
		WebElement number = driver.findElement(By.id("userNumber"));
		
		number.sendKeys("9767472754");		
	}
	
	@Test(priority = 4)
	public void subjectTextBox()
	{
		WebElement subject = driver.findElement(By.id("subjectsInput"));
		
		subject.sendKeys("For Re-evaluation or Recounting");
	}
	
	@Test(priority = 5)
	public void address()
	{
		WebElement address = driver.findElement(By.id("currentAddress"));
		
		address.sendKeys("Aurangabad");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{	
		System.out.println("********************************");
	}
}
