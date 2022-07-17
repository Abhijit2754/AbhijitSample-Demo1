package opp.webElements.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import opp.config.ConfigNameTest;
import utility.AllObject;

public class BootstrapSelectFormControl extends ConfigNameTest {
	
	public static void main(String[] args) throws InterruptedException
	{
		configMethod();
		
		driver.get("https://www.goibibo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//p[@class='sc-iIPllB ezZWci fswWidgetPlaceholder'])[2]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='sc-bZnhIo dTLqDo']//li[@class='sc-iTONeN jTNbzy']//span[@class='autoCompleteTitle ']"));
		
		AllObject.displayList(list);
		
		driver.close();
	}	
}