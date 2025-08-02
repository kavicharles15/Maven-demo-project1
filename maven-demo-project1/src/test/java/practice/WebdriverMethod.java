package practice;

import java.net.URL;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");

		
		String title = driver.getTitle();
		System.out.println(title);
	
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
	   
	    String page = driver.getPageSource();
	   System.out.println(page);
	    
	 //   Options opt = driver.manage();
	//    Window win = opt.window();
	//    win.maximize();
	    
	//     driver.manage().window().maximize();
	//     driver.manage().window().minimize();
	//     driver.manage().window().fullscreen();
	    
	//    Dimension size = driver.manage().window().getSize();
	//    System.out.println(size.getHeight());
	//    System.out.println(size.getWidth());
	      
	   
	//    Dimension dimension = new Dimension(500,600);
	//    driver.manage().window().setSize(dimension);
	    
	    Point Position = driver.manage().window().getPosition();
	    System.out.println(Position.getX());
	    System.out.println(Position.getY());
	    
	    Thread.sleep(2000);
	    Point point = new Point(100,300);
	    driver.manage().window().setPosition(point);
	}

}
