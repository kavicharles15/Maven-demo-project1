package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
	/*	WebElement USERNAME = driver.findElement(By.id("user-name"));
		WebElement PASSWORD = driver.findElement(By.id("password"));
		WebElement LOGIN = driver.findElement(By.id("login-button"));
		
		//case-->1
		Actions act = new Actions(driver);
	//	act.sendKeys(USERNAME,"standard_user").perform();
	//	act.sendKeys(PASSWORD,"secret_sauce").perform();
	//	act.click(LOGIN).perform();
		
		//case-->2
	//	act.sendKeys(USERNAME,"standard_user").sendKeys(PASSWORD,"secret_sauce").click(LOGIN).build().perform();
		*/
	//----------------------------------------------------------------------------------------------------------
		
	//	driver.get("https://www.flipkart.com");
		
	//	WebElement ele = driver.findElement(By.xpath("//span[text()='Fashion']"));
	//	Actions act = new Actions(driver);
	//   act.moveToElement(ele).perform();
		
	//	WebElement ele = driver.findElement(By.xpath("//span[text()='Mobiles']"));
	//  Actions act = new Actions(driver);
   // 	act.contextClick(ele).perform();
		
//----------------------------------------------------------------------------------------------------------
		
	//	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	//	
	//	WebElement drag = driver.findElement(By.id("draggable"));
	//	WebElement drop = driver.findElement(By.id("droppable"));
	//	Actions act = new Actions(driver);
	//	act.clickAndHold(drag).perform();
	//	act.release(drop).perform();
		
		//or
	//	act.clickAndHold(drag).release(drop).perform();
		
		//or
	//	act.dragAndDrop(drag, drop).perform();
//--------------------------------------------------------------------------------------------------------------

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement ele = driver.findElement(By.xpath("//button[.='Double Click Me To See Alert']"));
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
		
//--------------------------------------------------------------------------------------------------------------

	//	driver.get("https://www.makemytrip.com");
	//	Actions act=new Actions(driver);
	//	act.moveByOffset(10,20).click().perform();	

	}

}
