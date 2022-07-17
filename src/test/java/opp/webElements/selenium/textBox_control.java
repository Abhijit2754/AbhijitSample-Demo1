package opp.webElements.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class textBox_control {
	public static WebDriver driver;
	
	@Test
	public void textBoxExample()
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();		
		
		driver.get("https://www.google.com/");
		
		WebElement textBox = driver.findElement(By.name("q"));
		
		if(textBox.isDisplayed() && textBox.isEnabled())
		{
			textBox.sendKeys("Welcome to BoostMedia");
		}
	}
}
