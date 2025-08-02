package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HandlingAutoSuggestionEx1 {


	public static void main(String[] args) throws Throwable  {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		//driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("puma");
		
		Thread.sleep(1000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']"));
	    for (WebElement sugg : allSugg) 
	{
		System.out.println(sugg.getText());
		if (sugg.getText().contains("nike running shoes"))
		{
			Thread.sleep(1000);
			sugg.click();
		}
		
	}
			
		}
			
		


	}

