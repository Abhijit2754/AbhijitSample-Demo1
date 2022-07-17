package opp.locators.selenium.objectElement;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import opp.config.*;

public class RegistrationForm extends ConfigNameTest {
		
	@BeforeClass
	public void config()
	{
		configMethod();
	}
	
	@Test
	public void submitForm()
	{
		showUrl();
		
		By txt = By.name("q");
		
				
		
	}
}
