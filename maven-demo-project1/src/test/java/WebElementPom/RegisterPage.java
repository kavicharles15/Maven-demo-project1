package WebElementPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		
		
		PageFactory.initElements(driver,this);
	}
	
//	@FindBy(xpath = "//input[@id='gender-female']")
	@FindBy(id="gender-female")
	 private WebElement gender;
	
	@FindBy(id="FirstName")
    private	WebElement firstname;
    
	@FindBy(id="LastName")
    private WebElement Lastname;
    
	@FindBy(id="Email")
    private WebElement Email;
    
	@FindBy(id="Password")
    private WebElement password;
    
	@FindBy(id="ConfirmPassword")
    private WebElement ConfirmPassword;
    
	@FindBy(id="register-button")
    private WebElement register;

	@FindBy(xpath = "//div[@class='page registration-page']")
	private WebElement screenshot;
	
	public WebElement getScreenshot() {
		return screenshot;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(WebElement confirmPassword) {
		ConfirmPassword = confirmPassword;
	}

	public WebElement getRegister() {
		return register;
	}


	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

}
