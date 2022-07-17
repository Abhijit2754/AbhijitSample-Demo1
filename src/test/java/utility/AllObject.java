package utility;

import java.util.List;
import org.openqa.selenium.WebElement;

public class AllObject {
		
	public static void displayList(List<WebElement> list)
	{
		System.out.println("Number of city is :"+list.size());
		System.out.println("*******List of cities*******");
		
		for(WebElement i:list)		
			System.out.println(i.getText());
		
		System.out.println("*******************************");
		
		for(WebElement i:list)
		{	
			if(i.getText().contains("Puducherry, India"))
			{
				System.out.println("Selected City is :"+i.getText());
				i.click();
				break;
			}
		}			
	}
}
