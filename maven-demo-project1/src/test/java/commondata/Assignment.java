package commondata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {

	public static void main(String[] args) throws IOException  {
		
		WebDriver driver=null;
	   FileInputStream fis = new FileInputStream("./src/test/resources/firefox.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		
		String BROWSER = pObj.getProperty("browser");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");
		
		
		System.out.println("Browser"+" "+BROWSER);
		System.out.println("URL"+" "+URL);
		System.out.println("USERNAME"+" "+USERNAME);
		System.out.println("PASSWORD"+" "+PASSWORD);
		
		if (BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
			System.out.println("chrome");
		} else if (BROWSER.equals("edge")) {
			driver=new EdgeDriver();
			System.out.println("edge");
		}else if (BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}{

		}
		
		
		
		
		
		
		
		
		
		

	}
}