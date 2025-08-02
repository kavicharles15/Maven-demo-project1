package Testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenshotEx2Test {

	@Test
	public void m1() throws Throwable
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		
		WebElement ele = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		TakesScreenshot TS = (TakesScreenshot)ele;
		File src = TS.getScreenshotAs(OutputType.FILE);
		File dest = new File("./FailedEle.png");
		FileUtils.copyFile(src, dest);
	}
}
