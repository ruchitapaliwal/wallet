package waletpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.internal.ReporterConfig;

public class Functionaty2fa {
	
	WebDriver driver;
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proceedbutton;
	
	@FindBy(xpath="(//div[@class='image-wrap'])[3]")
	WebElement transferbutton;
	
	@FindBy(xpath="//img[@src='./../../../../assets/icons/nav-icon.svg']")
	WebElement hamburgermenu;
	
	@FindBy(xpath="//li[@class='d-flex']")
	WebElement prefernce;
	
	@FindBy(xpath="//span[@class='mat-slide-toggle-thumb']")
	WebElement enable2fa;
	
	@FindBy(xpath="//img[@src='./../../../../assets/icons/back-btn.svg']")
	WebElement backbutton;
	
	@FindBy(xpath = "//div[@class='logo']")
	WebElement hamburgerpage;
	
	@FindBy(xpath="//img[@src='./../../../assets/icons/history-icon.svg']")
	WebElement history;
	
	
	@FindBy(xpath="(//div[@class='image-wrap'])[1]")
	WebElement purchasebutton;
	
	@FindBy(xpath="//span[text()='You have enabled 2FA, Please enter the secure pin']")
	WebElement popupforvarificatiom;
	
	@FindBy(xpath="(//div[@class='image-wrap'])[2]")
	WebElement deposit;
	
	@FindBy(xpath = "//button[text()='Quick Transfer']")
    WebElement clicktransfer;
	
	@FindBy(xpath="//img[@src='./../../assets/icons/Group 483067.svg']")
	WebElement purchaseiconltc;
	
	@FindBy(xpath="(//div[@class='image-wrap'])[5]")
	WebElement depositltc;
	
	@FindBy(xpath="(//div[@class='image-wrap'])[6]")
	WebElement transferbuttonltc;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement entercode;
	
	@FindBy(xpath="//button[@class='verify']")
	WebElement verifybutton;
	
	@FindBy(xpath="//span[text()='Invalid Secure Pin']")
	WebElement invaliderrormessage;
	
	
	

	public Functionaty2fa() {
		this.driver=driver;
		
	}
	public void clickonproceedbitton() {
		proceedbutton.click();
	}
	public void clickhamburger() {
		hamburgermenu.click();
	}
	
	public void preferncebuttonn() {
		prefernce.click();
	}
	
	public void twofaenable() {
		enable2fa.click();
	}
	
	public void backtodashboard() {
		backbutton.click();
	}
	
	public void purchaseicon() {
		purchasebutton.click();
	}
	
	public void clickonpurchaseiconltc() {
		purchaseiconltc.click();
	}
	public void clickondepositltc() {
		depositltc.click();
	}
	public void transferltc() {
		transferbuttonltc.click();
	}
	public void clickonpurchase() {
		purchasebutton.click();
	}
	public void clickondeposit() {
		deposit.click();
	}
	public void clickontransfer() {
	transferbutton.click();
	}
	public void verificationpoppup() {
	 String expected_result = "You have enabled 2FA, Please enter the secure pin";
	 String actual_rsult = popupforvarificatiom.getText();
	 Assert.assertEquals(expected_result, actual_rsult);
	 Reporter.log("pop up is dispalyed");
	}
	public void entercode1() {
		entercode.sendKeys("4455");;
		}
	public void clickonverifybutton() {
		verifybutton.click();
		}
	public void errormessage() {
		if (invaliderrormessage.isDisplayed()) {
			System.out.println("testcase is passed");
			Reporter.log("error message is displayed");
			
		} else {
			System.out.println("testcase is failed");
			Reporter.log("error message is  not displayed");

		}
		}
	public void hamburgerpagedisplay() {
	if (hamburgerpage.isDisplayed()) {
		System.out.println("test case is passed");
		Reporter.log("hamburger page is opened");
	} else {
		System.out.println("test case is failed ");
		Reporter.log("hamburger page is not opened opened");

	}
	}
	public void clickonhistory() {
		history.click();
		}
	
	}
