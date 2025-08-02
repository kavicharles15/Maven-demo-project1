package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardUsingKeysClass {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//case-->1
	//	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	//	WebElement PASSWORD = driver.findElement(By.id("password"));
	//	PASSWORD.sendKeys("secret_sauce");
	//	PASSWORD.sendKeys(Keys.ENTER);
		  //or
	//	driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);
		
		//case-->2
	//	WebElement USERNAME = driver.findElement(By.name("user-name"));
	//	USERNAME.sendKeys("standard_user");
	//	USERNAME.sendKeys(Keys.TAB,"secret_sauce",Keys.ENTER);
		
		//case-->3
		driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		
	}

}
