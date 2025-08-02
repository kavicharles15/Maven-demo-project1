package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingEx1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("htttps://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		String price = driver.findElement(By.xpath("//div[ttext()='Apple iphone 16(Teal,256 GB)']/../..//div[@class='Nx9bqj_4b5DiR']")).getText();
		System.out.println(price);
		
		driver.findElement(By.xpath("//div[.='Apple iphone 16 (White, 128 GB)']/../following-sibling::div//div[@class='Nx9bqj_4b5DiR']")).getText();
		System.out.println(price);

		
		
		
		
	}

}
