package opp.hybridTestCases.selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Ddutil 

{
	public static void genmethod(WebElement element1,String value)     //Static Method 

	{
               Select dd=new Select(element1);
               List<WebElement> abc=dd.getOptions();
               System.out.println("Total elements are "+abc.size());
      
    	     for(WebElement i:abc)
    	         {
    		String text=i.getText();
    		System.out.println(text);
    		
    		   if(text.contains(value))
    		   {
    			i.click();
    			break;
    		   }
    	       }
		
	}
}

