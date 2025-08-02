package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeTypesofXpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.amazon.in");
		
	 //  driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("Bluetooth");
	 //  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	//driver.findElement(By.xpath("//a[text()='New Releases']")).click();
		
    //    driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	//    driver.findElement(By.xpath("//a[text()=\"Today Deals\"]")).click();
	 //   driver.findElement(By.xpath("//a[text()='Fresh']")).click();
		
	    driver.findElement(By.xpath("//ainput[contains(@aria-label,'S')]")).sendKeys("puma");
	    driver.findElement(By.xpath("//input[contains(@id,button')]")).click();  
	    
	    driver.findElement(By.xpath("//a[contains(text(),'MX')]")).click();
	}

}
