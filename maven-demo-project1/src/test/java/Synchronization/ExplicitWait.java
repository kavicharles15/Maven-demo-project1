package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://shoppersstack.com/products_page/25");
		
		WebElement checkText = driver.findElement(By.id("Check Delivery"));
		checkText.sendKeys("000000");
		
		WebElement checkBtn = driver.findElement(By.id("Check"));
		
		//Explicit Command
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable( checkBtn));
		
		 checkBtn.click();
		
		
		
		
		
		
		
		
		
		
	}

}
