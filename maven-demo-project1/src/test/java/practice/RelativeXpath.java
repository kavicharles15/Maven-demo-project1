package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.flipkart.com");
	
		//driver.findElement(By.xpath("//input[@type'text']")).sendKeys("Nike");
		
		//driver.findElement(By.xpath("//span[text()='Flight Booking']")).click();
		
		//driver.findElement(By.xpath("//input[contains(@tittle,'S')]")).sendKeys("Bluetooth");
		
		driver.findElement(By.xpath("//span[contains(text(),'gs')]")).click();

		
	}

}
