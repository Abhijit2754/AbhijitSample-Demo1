package opp.hybridTestCases.selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import opp.config.ConfigNameTest;

public class OrangeHRM extends ConfigNameTest
{
	@BeforeMethod
	public void init()
	{
		super.configMethod();
		
		WebDriverManager.chromedriver().setup();
		  
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
		
  @Test(dataProvider = "dataPasser")
  public void login(String username, String password) 
  {  
	  DataObjectOrangeHRM object = new DataObjectOrangeHRM(driver);
	  
	  object.dataMethodLogin(username,password);	  	  
  }
  
  @AfterMethod
  public void tearDown() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.close();
  }
  
  @DataProvider(name = "dataPasser")
  public Object[][] dataPasser()
  {
	  Object[][] details = new Object[3][2];
	  
	  details[0][0] = "Admin";
	  details[0][1] = "admin123";
	  
	  details[1][0] = "admin";
	  details[1][1] = "pasowrr";
	  
	  details[2][0] = "Admin";
	  details[2][1] = "Password";
	  
	  return details;
  }
}
