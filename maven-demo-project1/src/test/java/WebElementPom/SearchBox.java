package WebElementPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox {

WebDriver driver;
	
	public SearchBox(WebDriver driver) {
		this.driver=driver;
		
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getScreenShot() {
		return screenShot;
	}


    @FindBy(id="small-searchterms")
	private WebElement searchBox;
	
    @FindBy(xpath = "//input[@class='button-1 search-box-button']")
	private WebElement searchButton;
	
    @FindBy(xpath = "//div[@class='page-body']")
	private WebElement screenShot;
}
