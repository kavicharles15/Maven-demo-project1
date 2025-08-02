package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardStrokes {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		
		//case-->1
	//	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	//	driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
	//	WebElement Password = driver.findElement(By.name("password"));
	//	Password.sendKeys("secret_sauce");
	//	Password.sendKeys(Keys.ENTER);
		
		//case-->2
	//	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	//	driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys.ENTER);

		//case-->3
	//	WebElement USERNAME = driver.findElement(By.name("user-name"));
	//	USERNAME.sendKeys("standard_user");
	//	USERNAME.sendKeys(Keys.TAB,"secret_sauce",Keys.ENTER);
		
		//case-->4
	//	driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
//----------------------------------------------------------------------------------------------------------------------
		
		WebElement USERNAME = driver.findElement(By.name("user-name"));
		USERNAME.sendKeys("Qspiders",Keys.CONTROL+"a");
		USERNAME.sendKeys(Keys.CONTROL+"c");
		USERNAME.sendKeys(Keys.TAB,Keys.CONTROL+"v");
		
		
		
	}

}
