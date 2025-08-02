package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement customer = driver.findElement(By.name("cusid"));
		customer.sendKeys("999999");
		
		WebElement submitBtn = driver.findElement(By.name("submit"));
		submitBtn.click();
		
		Alert Alert = driver.switchTo().alert();
		Thread.sleep(3000);
		Alert.dismiss();
		
		
	}

}
