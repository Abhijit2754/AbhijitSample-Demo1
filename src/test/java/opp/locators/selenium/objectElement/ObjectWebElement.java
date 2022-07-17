package opp.locators.selenium.objectElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectWebElement {
	
	public static WebElement testBox(WebDriver driver)
	{
		WebElement textBoxElement = driver.findElement(By.name("q"));
		
		return textBoxElement;
	}
	
	public static WebElement buttonClick(WebDriver driver)
	{
		WebElement buttonClick = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		
		return buttonClick;
	}
	
	public static WebElement clickBusinessPage(WebDriver driver)
	{
		WebElement clickBusines = driver.findElement(By.xpath("//a[@role='button']//div[contains(text(),'Website')]"));
		return clickBusines;
	}
	
	public static WebElement insertGoogleText(WebDriver driver)
	{
	
		return null;
	}
}
