package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebpageScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://doodles.google/");
		
		//step 1- typecasting
		TakesScreenshot TS = (TakesScreenshot)driver;
		
		//step 2- By using above referal variable
		File temp = TS.getScreenshotAs(OutputType.FILE);
		
		//step 3- permanent location
		File permanentLoc = new File("./screenshot/HomePage.jpeg");
		
		//step 4- copy temp to permanent Location
		FileHandler.copy(temp, permanentLoc);
		
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
