package WebElementPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPage {

	WebDriver driver;
	
	//Initialization
		public FlipkartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

		//Element declaration
	@FindAll({@FindBy(name="q"),@FindBy(css="//input[title='Search for Products, Brands and More')]")})
		private WebElement searchBar;
		
	@FindAll({@FindBy(xpath = "//button[@type='submit']"),@FindBy(xpath = "//button[contains(@aria-label,'Search for Products, Brands and More')]")})
    	private WebElement searchIcon;



	  //getter methods
		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getSearchBar() {
			return searchBar;
		}

		public WebElement getSearchIcon() {
			return searchIcon;
		}
		
	
		//Bussiness Logic
		/**
		 * This method is used to search prd
		 * @param ele
		 * @author Shobha
		 */
		public void searchPrd(String ele)
		{
			searchBar.sendKeys(ele);
			searchIcon.click();
		}
		
		}		
			
		

	
	

