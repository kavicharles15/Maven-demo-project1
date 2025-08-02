package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingEx2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();
		
		//String matchesWon = driver.findElement(By.xpath("//p[text()='UP Yoddhas']/../../../..//div[@class='table-data matches-won']")).getText();
		//System.out.println("total num of matches won---->"+matchesWon);
		
		
       // String matchesLost = driver.findElement(By.xpath("//p[text()='UP Yoddhas']/../../../..//div[@class='table-data matches-lost']")).getText();
       // System.out.println("total num of matches lost---->"+matchesLost);
		
		//driver.findElement(By.xpath(""))
		//System.out.println();
        
        
		//String won = driver.findElement(By.xpath("//p[text()='Haryana Steelers'/ascandor::div[@class='row-head']//div[@class='table-data matches-won']")).getText();
	   // System.out.println("total nm of matches won"+ won);
	    
	   // driver.findElement(By.xpath(""))
	   // System.out.println();
	    
	    //driver.findElement(By.xpath(""))
	    //System.out.println();
	
	}

}
