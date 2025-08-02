package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
	//	driver.switchTo().frame(0);   //By index
		
	//	driver.switchTo().frame("SingleFrame"); // By name
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(iframe);
		
		
	    Thread.sleep(2000);
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("000000");
		
		driver.switchTo().parentFrame();
		
		WebElement homeBtn = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		homeBtn.click();
		
		 Thread.sleep(2000);
		driver.quit();
			

	}

}
