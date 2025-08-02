package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
	    driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement iframe = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
		
		driver.switchTo().frame(iframe);
		
		WebElement homeBtn = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
		driver.switchTo().frame(homeBtn);
		
	    Thread.sleep(2000);
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("000000");
		input.click();
		driver.switchTo().defaultContent();

		driver.quit();
	}

}
