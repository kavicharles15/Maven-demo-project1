package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopups {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		WebElement clickMebtn = driver.findElement(By.xpath("(//button[text()='Click Me'])[3]"));
		clickMebtn.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.getText();
		alert.accept();
		
		
	}

}
