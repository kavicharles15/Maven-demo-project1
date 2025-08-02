package ScroolActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoview {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://doodles.google/");
		
		WebElement btn = driver.findElement(By.linkText("See all results"));
		
		//javascriptExecutor typecasting
		JavascriptExecutor jcs = (JavascriptExecutor)driver;
		jcs.executeScript("arguments[0].scrollIntoview(true)",btn);
	}

}
