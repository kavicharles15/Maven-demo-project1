package WebElementPom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToclickRegister {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//Home Page
	/*	 Homepage HP = new Homepage(driver);
		 HP.getRegisterButton().click();
		 
		 //Register Button
		 RegisterPage RP = new RegisterPage(driver);
		 RP.getGender().click();
		 RP.getFirstname().sendKeys("Rifa");
		 RP.getLastname().sendKeys("Jas");
		 RP.getEmail().sendKeys("sumo12@gmail.com");
		 RP.getPassword().sendKeys("123456");
		 RP.getConfirmPassword().sendKeys("123456");
		 RP.getRegister().click();
		 Thread.sleep(2000);
		 File temp = RP.getScreenshot().getScreenshotAs(OutputType.FILE);
		 File perm = new File("./screenshot/form.png");
		FileHandler.copy(temp, perm);*/
		
		 
		 //serachBox
		SearchBox SB = new SearchBox(driver);
		SB.getSearchBox().sendKeys("Laptop");
		SB.getSearchButton().click();
		File temp1 = SB.getScreenShot().getScreenshotAs(OutputType.FILE);
	    File perm1 = new File("./screenshot/lapsearch.png");
	    FileHandler.copy(temp1, perm1);
		  

		 driver.quit();
	}

}
