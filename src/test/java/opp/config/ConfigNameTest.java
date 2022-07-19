package opp.config;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigNameTest {
	
	public static WebDriver driver;
	
	public void showUrl()
	{
		driver.get("https://www.google.com/");
	}

	public static void configMethod()
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}
}
