package opp.hybridTestCases.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A
{
	   public static void main(String[] args)	
	   {
		   	   WebDriverManager.chromedriver().setup();
		   	   
               WebDriver driver=new ChromeDriver();

               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
               driver.get("https://opensource-demo.orangehrmlive.com");        
        
               driver.findElement(By.name("txtUsername")).sendKeys("Admin");
               driver.findElement(By.name("txtPassword")).sendKeys("admin123");        
               driver.findElement(By.name("Submit")).click();    
               
               driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
        
     	       WebElement empstatus=driver.findElement(By.id("empsearch_employee_status"));
		       Ddutil.genmethod(empstatus,"Freelance");
		        
		       WebElement Include=driver.findElement(By.id("empsearch_termination"));
		       Ddutil.genmethod(Include,"Past Employees Only");
		       
		       WebElement jobttle=driver.findElement(By.id("empsearch_job_title"));
		       Ddutil.genmethod(jobttle,"EA");
		               
		       WebElement subunit=driver.findElement(By.id("empsearch_sub_unit"));
		       Ddutil.genmethod(subunit,"All");    
	 }

}
