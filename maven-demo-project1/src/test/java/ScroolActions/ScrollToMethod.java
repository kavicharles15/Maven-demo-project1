package ScroolActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://doodles.google/");
		
		//JavascriptExecutor typecasting
		JavascriptExecutor jcs = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		//extreme bottom scroll
		jcs.executeScript("window.scrollT0(0,document.body.scrollHeight)");
		
		//scroll To
		jcs.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);
		
		//extreme top scroll
		jcs.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		jcs.executeScript("window.scrollTo(0,1500)");
		
		
	}

}
