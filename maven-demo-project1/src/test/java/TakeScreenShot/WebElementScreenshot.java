package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");

		WebElement logo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		File temp = logo.getScreenshotAs(OutputType.FILE);
		File location = new File("./screenshot/logo.png");
		
		FileHandler.copy(temp, location);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
