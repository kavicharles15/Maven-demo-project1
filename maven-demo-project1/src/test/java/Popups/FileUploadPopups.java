package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopups {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com");
		
		WebElement registerBtn = driver.findElement(By.linkText("Register"));
		registerBtn.click();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		WebElement experience = driver.findElement(By.xpath("//p[text()='  I have work experience (excluding internships)']"));
		experience .click();
		
		WebElement uploadBtn = driver.findElement(By.id("resumeUpload"));
     	uploadBtn.sendKeys("D:\\Selenium.doc");
		
		
		
		
	}

}
