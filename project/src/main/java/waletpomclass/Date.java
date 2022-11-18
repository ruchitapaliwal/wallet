package waletpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Date {
	@FindBy (xpath ="//button[text()='Proceed']" )
	WebElement proceedbutton;
	@FindBy (xpath ="//input[@placeholder='First Name']" )
	WebElement firstname;
	@FindBy (xpath = "//mat-error[text()='Enter valid First Name']" )
	WebElement errormsg1;
	
	WebDriver driver;
	@FindBy (xpath ="//button[@aria-label='Open calendar']" )
	WebElement clickonclaneder;
    @FindBy (xpath ="(//span[@class='mat-button-wrapper'])[2]" )
    WebElement clickonyear;
    @FindBy (xpath = "//button[@class='mat-focus-indicator mat-calendar-previous-button mat-icon-button mat-button-base']" )
    WebElement clickonarrow;
     @FindBy (xpath = "(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]\")" )
    WebElement selectyear;
    @FindBy (xpath="(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")
    WebElement selectmonth;
	@FindBy (xpath = "//div[text()=' 26 ']" )
	WebElement date;
	//@FindBy (xpath = "//mat-error[@class='mat-error ng-star-inserted']" )
	WebElement error;
	
	public Date(WebDriver driver) {
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
	
	
	public void calander() {
		clickonclaneder.click();
	}
		public void year() {
			clickonyear.click();
		}
			public void arrow() {
				clickonarrow.click();
			}
			public void year1() {
				selectyear.click();
			}
			public void month() {
				selectmonth.click();
			}
				
	public void selectdate() {
		date.click();
		
	}
	public void errormsg() {
	if (error.isDisplayed()) {
		System.out.println("test case is passed");
	
		} else {
		System.out.println("test case is failed");

	}
	}}
	
	
	
	


