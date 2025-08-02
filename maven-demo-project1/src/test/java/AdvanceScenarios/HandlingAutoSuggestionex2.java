package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestionex2 {
	
	public static void main(String [] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		
	   driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("mangos");
	   
	  Thread.sleep(1000);
	  List<WebElement> allMngs = driver.findElements(By.xpath("//span[@class=\"Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-sc-rtz2vl-7 gJxZPQ gFDEBU\"]"));
	   
	  int count=0;
	  for (WebElement mngs : allMngs)
	  {
		   System.out.println(mngs.getText());
		   count++;
		   
		   if (mngs.getText().contains("Alphonso Mango-Badami"))
		   {
			mngs.click();
	       }
	      }
	      System.out.println("total auto sugg eles-->"+count);
}
}
