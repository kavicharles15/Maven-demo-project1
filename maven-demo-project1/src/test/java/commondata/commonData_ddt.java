package commondata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class commonData_ddt {

	public static void main(String[] args) throws IOException {

		//step - 1  create object for FileInput stream
		FileInputStream fis = new FileInputStream("./src/test/resources/Assignment.properties");
		
		//step - 2 create object for File type
		Properties pObj = new Properties();
		
		// step - 3 load the file
		pObj.load(fis);
		
		//step - 4 read the data using getProperties
		String BROWSER = pObj.getProperty("browser");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");
		
		System.out.println("Browser"+" "+BROWSER);
		System.out.println("URL"+" "+URL);
		System.out.println("USERName"+" "+USERNAME);
		System.out.println("PASSWORD"+" "+PASSWORD);
		
	
		
		
		
	

	}

}
