package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingDropDownUsingKeysTest {

	@Test
	public void handlingDropDownUsingKeysTest() {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement dataList = driver.findElement(By.id("day"));
		dataList.click();
		dataList.sendKeys(Keys.ARROW_DOWN);
		dataList.sendKeys(Keys.ARROW_DOWN);
		
		WebElement monthList = driver.findElement(By.id("month"));
		monthList.click();
		monthList.sendKeys(Keys.ARROW_UP);
		monthList.sendKeys(Keys.ARROW_UP);
		monthList.sendKeys(Keys.ARROW_UP);
	}

}
