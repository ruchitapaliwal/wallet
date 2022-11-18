package waletpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Newuser {
	WebDriver driver;
	@FindBy (xpath ="//button[text()='Proceed']" )
	WebElement proceedbutton;
	@FindBy (xpath ="//input[@class='ng-untouched ng-pristine ng-invalid']" )
	WebElement firstname;
	@FindBy (xpath = "//mat-error[text()='Enter valid First Name']" )
	WebElement errormsg1;
	@FindBy (xpath ="//input[@placeholder='Last Name']" )
	WebElement lastname;
	@FindBy (xpath = "//mat-error[text()='Enter valid Last Name']")
	 WebElement errorms2;
	
	
	
	
	public Newuser(WebDriver driver) {
	  this.driver=driver;
	}
	
	public void proceedbutton1() {
		proceedbutton.click();
		
		
	}
	public void firstname1() {
		firstname.sendKeys("1233");
		
		
	}
	public void msgshows() {
		if (errormsg1.isDisplayed()) {
			System.out.println("test case is passed");
			
		} else {
			System.out.println("test case is failed");

		}
	}
	public void lastname1() {
		lastname.sendKeys("19233");
		
		
	}
	
	public void msgshows2() {
		if (errorms2.isDisplayed()) {
			System.out.println("test case is passed");
			
		} else {
			System.out.println("test case is failed");

		}
	}
	
	
	
}
