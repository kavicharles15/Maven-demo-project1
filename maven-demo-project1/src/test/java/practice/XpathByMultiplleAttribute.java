package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultiplleAttribute {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text' and @name='field-keywords']")).sendKeys("nike");
		
		driver.findElement(By.xpath("//input[@type=submi or @value='Go']")).click();
		
		driver.findElement(By.xpath("//a[@href='minitv?ref_=nav_avod_desktop_topnav' and txt()='MX Player']")).click();
		
		driver.findElement(By.xpath("a[text()='MX Player' or contains(@href,'/minitv')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'MX') and contains(@href,'/minitv')]")).click();

	}

}
