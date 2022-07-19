package opp.hybridTestCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataObjectOrangeHRM {
	
	public WebDriver driver;
	
	By userName = By.name("txtUsername");
	By Password = By.id("txtPassword");
	By loginButton = By.id("btnLogin");
	
	public DataObjectOrangeHRM(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void dataMethodLogin(String username, String password)
	{	
		driver.findElement(userName).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(loginButton).click();
	}
}
