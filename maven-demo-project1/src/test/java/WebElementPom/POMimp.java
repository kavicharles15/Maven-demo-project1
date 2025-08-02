package WebElementPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMimp {

	
	public static void main(String [] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com/");
		
		//implemented using getters
	//	FlipkartPage Page = new FlipkartPage(driver);
	//	Page.getSearchBar().sendKeys("Nike");
	//	Page.getSearchIcon().click();
		
		FlipkartPage Page = new FlipkartPage(driver);
		Page.searchPrd("Nike");
	}
}
