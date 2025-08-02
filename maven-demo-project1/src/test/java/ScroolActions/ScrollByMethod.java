package ScroolActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByMethod{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://doodles.google/");
		
		//javascriptExecuter typecasting
		JavascriptExecutor jcs = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		//executescript()
		jcs.executeScript("window.scrollBy(0,500)");
		
		
	}

}
