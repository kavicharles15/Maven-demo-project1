package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("[type='text']")).sendKeys("standard_user");
	//---------------------------------------------------------------------------------------------------
	
		driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("secret_sauce");
   //---------------------------------------------------------------------------------------------------
        
        //driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
   //----------------------------------------------------------------------------------------
        
		//driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
   //----------------------------------------------------------------------------------------
		
		//driver.findElement(By.cssSelector(".btn_action")).click();
	//--------------------------------------------------------------------------------------------
		
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
	}

}
