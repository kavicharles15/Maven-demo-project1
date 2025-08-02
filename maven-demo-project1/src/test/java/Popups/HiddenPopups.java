package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		WebElement CloseBtn = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
		CloseBtn.click();
		
		WebElement Departure = driver.findElement(By.xpath("//span[text()='Departure']"));
		Departure.click();
		
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='Fri Aug 01 2025']"));
		date.click();
	}

}
