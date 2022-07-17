package excelFileRead;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import opp.config.ConfigNameTest;

public class DataProvideExample extends ConfigNameTest{
	
	@BeforeMethod
	public void method()
	{
		super.configMethod();
	}
	
	@Test(dataProvider = "string")	
	public void methodRun(String name)
	{
		driver.get("https://www.google.com");		
		
		ObjectData.PassData(driver).sendKeys(name);
		
		ObjectData.passClickButton(driver).click();
		
		
	}
	
	@AfterMethod
	public void methodafter() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	
	@DataProvider(name="string")
	public String[][] mainPassData()
	{
		String[][] data= new String[5][1];
		
		data[0][0] = "boostmedia";
		
		data[1][0] = "Vivek Bindra";
		
		data[2][0] = "kaludada";
		
		data[3][0] = "Milka Singh";
		
		data[4][0] = "Bhagan Bhag";
		
		return data;
	}
}
