package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEx2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.flipkart.com");
	    driver.manage().window().maximize();
	    
	 //  driver.findElement(By.linkText("Mobiles")).click();
//------------------------------------------------------------------------------------------------
	    
	    driver.get("https://www.amazon.in");
	   // driver.findElement(By.linkText("MX Player")).click();
	   //driver.findElement(By.linkText("Today's Deals")).click();
	    
	    
	    driver.findElement(By.partialLinkText("Customer")).click();
	    driver.findElement(By.partialLinkText("Deals")).click();
	    



	}

}
