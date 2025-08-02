package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practice.WebdriverMethod;

public class HandlingSVElements {

	public static void main(String[] args) {

		//SVG --> Scalar Vector Graphics
		//Svg syntax --> //*[name()='svg' and @AttributeName='AttributeValur']
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kayak.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[name()='svg' and @class=\"A_8a-icon\"]")).click();
		
		https://github.com/sanjaygit1/BasicSelenium_QCO-SOEJVD-E31.git 
			https://github.com/sanjaygit1/BasicSeleniumProject.git
	}

}
