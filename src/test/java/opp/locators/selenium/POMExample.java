package opp.locators.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import opp.locators.selenium.objectElement.ObjectWebElement;

import opp.config.ConfigNameTest;

public class POMExample extends  ConfigNameTest{	
	
	@BeforeMethod
	public void methodConfigfor()
	{
		super.configMethod();
	}	
	
	@Test(priority = 1,groups = "sanity")
	public void methodUrl() 
	{
		driver.get("https://www.google.com");
		
		ObjectWebElement.testBox(driver).sendKeys("boostmedia");
		ObjectWebElement.buttonClick(driver).click();		
		ObjectWebElement.clickBusinessPage(driver).click();
	}
	
	@Test(priority = 2)
	public void methodForClickkBusinessPage()
	{
		System.out.println("Excecuted");
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
