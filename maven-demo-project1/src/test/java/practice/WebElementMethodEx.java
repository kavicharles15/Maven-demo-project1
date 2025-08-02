package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodEx {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
	//	 driver.get("https://www.flipkart.com");
     	 driver.manage().window().maximize();
		
	//	driver.findElement(By.name("q")).sendKeys("puma");
	//	driver.findElement(By.cssSelector("[type='submit']")).click();
		
	//	WebElement searchBar = driver.findElement(By.name("q"));
	//	searchBar.sendKeys("BlueTooth");
	//	searchBar.submit();
		//--------------------------------------------------------------------------------
		
    /*    driver.get("https://www.saucedemo.com/v1/");
        WebElement userTextfield = driver.findElement(By.id("user-name"));
        userTextfield.sendKeys("Shobha");
        Thread.sleep(1000);
        userTextfield.clear();
       
        
        Thread.sleep(1000);
        userTextfield.sendKeys("standard_user");*/
        
        
 //------------------------------------------------------------------------------
       
 /*  driver.get("https://www.facebook.com");
      WebElement fbLogo = driver.findElement(By.xpath("//img[contains(@class,'fb')]"));
      if(fbLogo.isDisplayed()) 
      {
    	  System.out.println("Logo is displayed");
      }
      else
      {
    	  System.out.println("Logo is not displayed");
      }
      WebElement ele = driver.findElement(By.xpath("//a[text()='Create new account']"));
      if(ele.isEnabled())
      {
    	 ele.click();
      }
      else
      {
    	  System.out.println("element not enabled");
      }
       Thread.sleep(2000);
      WebElement radioButton = driver.findElement(By.xpath("//input[@value='1']"));
      radioButton.click();
      if(radioButton.isSelected())
      {
    	  System.out.println("radio is selected");
      }
      else
      {
    	  System.out.println("radio not selected");
      }*/

//------------------------------------------------------------------------------------------------------------- 
 /*     driver.get("https://www.facebook.com"); 
      WebElement ele = driver.findElement(By.linkText("ಕನ್ನಡ"));
      System.out.println(ele.getLocation().getX()); 
      System.out.println(ele.getLocation().getY()); 
     
      System.out.println(ele.getSize().getHeight()); 
      System.out.println(ele.getSize().getWidth()); 
     
       System.out.println(ele.getRect().getX());
       System.out.println(ele.getRect().getY()); 
       System.out.println(ele.getRect().getHeight()); 
       System.out.println(ele.getRect().getWidth()); 
   */
   //-------------------------------------------------------------------------------------------------------------
  /*   driver.get("https://www.facebook.com");
	// String name = driver.findElement(By.cssSelector("[title='Log in to Facebook']")).getTagName();
	// System.out.println(name); 
		 
		WebElement ele = driver.findElement(By.cssSelector("[alt='Facebook']"));
	//	System.out.println(ele.getAttribute("class"));
		
		System.out.println(ele.getDomAttribute("src"));*/
//---------------------------------------------------------------------------------------------------------------
     //	 driver.get("https://www.flipkart.com");
     //	WebElement ele = driver.findElement(By.xpath("//span[.='Grocery']"));
    // 	 System.out.println(ele.getDomProperty("autocapitalize"));
		
	//	System.out.println(ele.getCssValue("font-size"));
	//	System.out.println(ele.getCssValue("color"));
//----------------------------------------------------------------------------------------------------------------		
	 driver.get("https://www.amazon.in");  
	//  WebElement ele = driver.findElement(By.name("field-keywords"));
	//  System.out.println(ele.getAccessibleName());
	//  System.out.println(ele.getAriaRole());
	  
	// WebElement ele1 = driver.findElement(By.cssSelector("[href='/minitv?ref_=nav_avod_desktop_topnav']"));
	// System.out.println(ele1.getAccessibleName());
	//  System.out.println(ele1.getAriaRole());
 
     driver.findElement(By.name("field-keywords")).sendKeys("pumaTshirt");
     driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
     
    String price = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
     System.out.println(price);
     	 
     	 
     	 
     	 
     	 
     	 
     	 
	}

}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      