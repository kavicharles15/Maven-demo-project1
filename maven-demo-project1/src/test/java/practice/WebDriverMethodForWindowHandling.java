package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodForWindowHandling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
	    String win = driver.getWindowHandle();
       	System.out.println(win);
       	
       	driver.findElement(By.xpath("(//div[@class=\"kzDlHZ\"][1]")).click();
       	
        Set<String> allwin = driver.getWindowHandles();
        System.out.println(allwin);
         
        driver.close();
       // driver.quit();
	}

}
