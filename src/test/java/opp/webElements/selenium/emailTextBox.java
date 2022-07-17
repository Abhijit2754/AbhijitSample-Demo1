package opp.webElements.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class emailTextBox {
	
	public static WebDriver driver;
	
	@Test
	public void email_TextBox()
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement emailTextBox = driver.findElement(By.id("userEmail"));
		
		if(emailTextBox.isDisplayed() && emailTextBox.isEnabled())
		{
			emailTextBox.sendKeys("abhijitpaithane93@gmail.com");
		}		
	}
}
