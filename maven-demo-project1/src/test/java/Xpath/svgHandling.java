package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class svgHandling {

	public static void main(String[] args) throws InterruptedException {
		
	/*	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.highcharts.com/demo");
		
		WebElement svg = driver.findElement(By.xpath("//*[name()='svg' and @aria-labelledby=\"logo-highcharts-title\"]"));
		svg.click();*/
	//--------------------------------------------------------------------------------------------------------------------------
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[local-name()='svg'][1]")).click();

	}

}
