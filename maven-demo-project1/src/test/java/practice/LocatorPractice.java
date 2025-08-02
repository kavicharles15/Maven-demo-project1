package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.facebook.com/");
	//	driver.manage().window().maximize();
		
	//	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	//	driver.findElement(By.name("pass")).sendKeys("Apple");
		
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("field-keywords")).sendKeys("puma");
		

	}

}
