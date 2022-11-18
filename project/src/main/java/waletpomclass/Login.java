package waletpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Email Address']")
	WebElement emailid;
	
	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
	WebElement checkbox;
	
    @FindBy(xpath = "//button[text()='Get Started']")
    WebElement login;
    
    @FindBy(xpath = "//button[text()='Back to Login']")
    WebElement backbutton;
    
	
	
	
	public Login(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void entermailid(String email) {
		emailid.sendKeys(email);
		
		
	}
	public void checkbokbutton() {
		checkbox.click();
		
		}
	public void getstartedbutton() {
		login.click();
		
		}
	public void back() {
		backbutton.click();
		
		}
}
