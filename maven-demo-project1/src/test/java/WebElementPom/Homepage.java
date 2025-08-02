package WebElementPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
	

	public Homepage(WebDriver driver) {
		this.driver=driver;
		
		
		PageFactory.initElements(driver,this);
	}

	@FindBy(linkText = "Register")
	
	private WebElement registerButton;
	
	private WebElement LoginButton;
	
	private WebElement shoppingCart;
	
	private WebElement wishList;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWishList() {
		return wishList;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getShoppingCart() {
		return shoppingCart;
		
	
	}	
	
}
