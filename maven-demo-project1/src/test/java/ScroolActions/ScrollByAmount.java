package ScroolActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmount {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		//scrollUp
		act.scrollByAmount(100, 0).perform();
		
		//scrollDown
		act.scrollByAmount(0, 400).perform();
		
		
		
		
	}

}
