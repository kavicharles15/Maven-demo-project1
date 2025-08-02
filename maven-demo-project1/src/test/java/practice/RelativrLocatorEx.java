package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativrLocatorEx {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        
        String txtmsg = driver.findElement(By.xpath("//span[starts-with(text(),'Login was')]")).getText();
        System.out.println(txtmsg);
        
        driver.findElement(By.xpath("//span[ends-with(text(),'try again.')]"));
        
 //-------------------------------------------------------------------------------------
        // WebElement ele = driver.findElement(By.xpath("//input[@value='Search store']"));
        //driver.findElement(RelativeLocator.with(By.tagName("'input")).near(ele)).click();
        
       // WebElement searchIcon = driver.findElement(By.xpath("//input[@type='submit']"));
       // driver.findElement(RelativeLocator.with(By.tagName("input")).near(searchIcon)).sendKeys("Book");   
        
        
	}

}
