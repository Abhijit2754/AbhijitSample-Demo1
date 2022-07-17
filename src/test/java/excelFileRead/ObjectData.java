package excelFileRead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectData {
	
	public static WebElement PassData(WebDriver driver)
	{
		WebElement element = driver.findElement(By.name("q"));
		
		return element;
	}
	
	public static WebElement passClickButton(WebDriver driver)
	{
		WebElement clickButton = driver.findElement(By.name("btnK"));
		
		return clickButton;
	}
}