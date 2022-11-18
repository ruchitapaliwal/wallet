package waletpomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Nextbuttonforwelcomepage {
	WebDriver driver;
	@FindBy (xpath ="//button[text()='Proceed']" )
	WebElement proceedbutton;
	@FindBy (xpath ="//input[@class='ng-untouched ng-pristine ng-invalid']" )
	WebElement firstname;
	@FindBy (xpath ="//input[@placeholder='Last Name']" )
	WebElement lastname;
	@FindBy (xpath ="//select[@class='ng-untouched ng-pristine ng-invalid']" )
	WebElement country;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-icon-button mat-button-base']")
	WebElement calanderbutton;
	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[2]")
	WebElement clickyear;
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-calendar-previous-button mat-icon-button mat-button-base']")
	WebElement clickarrow;
	@FindBy(xpath="(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")
	WebElement selectyear;
	@FindBy(xpath="(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[1]")
	WebElement selectmonth;
	@FindBy(xpath="(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[2]")
	WebElement selectday;
	@FindBy (xpath = "//mat-error[@class='mat-error ng-star-inserted']" )
	WebElement error;
	@FindBy(xpath="//button[text()='Next']")
	WebElement next;
	@FindBy(xpath ="//button[text()='Next']" )
	WebElement nextbutton;
	@FindBy(xpath = "(//div[@class='input-field']//input)[1]")
	WebElement emailaddress;
	
	
	
	
	

	
	
	
	
	public Nextbuttonforwelcomepage(WebDriver driver) {
		this.driver=driver;
	}
   
    public void getproceedbutton() {
		proceedbutton.click();
		
		
	}
	public void firstnametext() {
		firstname.sendKeys("ruchi");
		
	}public void lastnametext() {
		lastname.sendKeys("paliwal");	
		
}
	public void countryselected() {
	  Select s=new Select(country);
	  s.selectByIndex(1);
	}

public void dateselecctfromcalander() {
	calanderbutton.click();	
	
	
}
public void year() {
	clickyear.click();	
	
}
public void arrowselect() {
	clickarrow.click();	
	
}
public void selectyear1() {
	selectyear.click();	
	
}
public void selectmos() {
    selectmonth.click();	
	
}
public void date() {
		selectday.click();	
		
}
public void nextbutton3() {
	next.click();	
	
}
public void nextdisable() {
	if (next.isEnabled()) {
		System.out.println("tase case is failed");
		Reporter.log("failed-button is enabled",true);
		
	} else {
		System.out.println("tase case is passed");
		Reporter.log("passed-button is disabled without entering firstname",true);
	}
	
	
}
public void nextdisablelast() {
	if (next.isEnabled()) {
		System.out.println("tase case is failed");
		Reporter.log("failed-button is enabled without entering lastname",true);
		
	} else {
		System.out.println("tase case is passed");
		Reporter.log("passed-button is disabled  without entering lastname",true);
	}
}
public void nextdisablecountry() {
	if (country.isSelected()) {
		System.out.println("tase case is failed");
		Reporter.log("failed-button is enabled  without selectingcountry",true);
		
	} else {
		System.out.println("tase case is passed");
		Reporter.log("passed-button is disabled without selecting country",true);
	}}

public void nextdisablecalender() {
	if (calanderbutton.isSelected()) {
		System.out.println("tase case is failed");
		Reporter.log("failed-button is enabled without selecting date",true);
		
	} else {
		System.out.println("tase case is passed");
		Reporter.log("passed-button is disabled without selecgeting date",true);
	}}
public void errormsg() {
	if (error.isDisplayed()) {
		System.out.println("test case is passed");
	     Reporter.log("Passed-error message dispaly when select invalid date");
		} else {
		System.out.println("test case is failed");
		Reporter.log("Passed-error message does not dispaly when select invalid date");

	}
	}

public void nextbuttonwelcomepage() {
	nextbutton.click();
}
public void useremailaddress() {
	//String actual = emailaddress.getText();
	//System.out.println(actual);
	 WebElement actual = driver.findElement(By.xpath("(//div[@class='input-field']//input)[1]"));
	String expected_result="manoged785@lance7.com";
	Assert.assertEquals(actual, expected_result);
	Reporter.log("test is passed",true);
}
}
