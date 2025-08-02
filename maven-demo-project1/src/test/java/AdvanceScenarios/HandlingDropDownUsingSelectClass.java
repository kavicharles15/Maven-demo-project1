package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement dateList = driver.findElement(By.id("day"));
		Select select = new Select(dateList);
		//select.selectByIndex(13);
		//select.selectByValue("10");
		//select.selectByVisibleText("15");
		
		WebElement monthList = driver.findElement(By.id("month"));
		Select select1 = new Select(monthList);
		//select1.selectByValue("3");
		//select1.selectByVisibleText("Dec");
		//select.selectByVisibleText("Dec");
		
		WebElement yearList = driver.findElement(By.id("year"));
		Select select2 = new Select(yearList);
		//select2.selectByValue("2010");
		//select2.selectByVisibleText("2015");
		//select.selectByVisibleText("2015");
//--------------------------------------------------------------------------------------------------------------------		
		List<WebElement> allOpts = select.getOptions();
	    for (WebElement opt : allOpts) 
	    {
			
	    	System.out.println(opt.getText());
		}
	    List<WebElement> allOpt = select1.getOptions();
	    for (WebElement opts : allOpt)
	    {
			System.out.println(opts.getText());
		}
	  List<WebElement> allOps = select2.getOptions();
	  for (WebElement ops : allOps)
	  {
		System.out.println(ops.getText());
	}  
	    
	}

}
