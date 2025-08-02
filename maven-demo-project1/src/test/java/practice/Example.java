package practice;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.flipkart.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String source = driver.getPageSource();
		System.out.println(source);
		
	//	driver.manage().window().maximize();
		
	//	driver.manage().window().minimize();
		
	//	driver.manage().window().fullscreen();
		
	//	Dimension size = driver.manage().window().getSize();
	//	System.out.println(size.getHeight());
	//	System.out.println(size.getWidth());
		
	//   Dimension size = new Dimension(500, 600);
    //   driver.manage().window().setSize(size);
        
	//	Point position = driver.manage().window().getPosition();
	//	System.out.println(position.getX());
	//	System.out.println(position.getY());
		
    //    Point pont = new Point(20, 30);
	//	  driver.manage().window().setPosition(pont);
	}
	
	
	

}
