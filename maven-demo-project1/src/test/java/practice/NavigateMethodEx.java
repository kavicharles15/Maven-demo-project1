package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodEx {

	public static void main(String[] args) throws Throwable{
	WebDriver driver=new ChromeDriver();
	
    driver.navigate().to("https://www.amazon.in");
    
  //  driver.get("https://www.flipkart.com");
    
    Thread.sleep(1000);
    driver.navigate().back();
    
    Thread.sleep(1000);
    driver.navigate().forward();
    
    Thread.sleep(1000);
    driver.navigate().refresh();
    
   
		
	}

}
