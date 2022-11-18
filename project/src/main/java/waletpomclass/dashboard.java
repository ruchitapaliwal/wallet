package waletpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class dashboard {
	WebDriver driver;
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proceedbutton;
	
	@FindBy(xpath="(//div[@class='image-wrap'])[3]")
	WebElement transferbutton;
	
	@FindBy(xpath="//h3[@class='ng-star-inserted']")
	WebElement notificationforlowbalnce;
	
	@FindBy(xpath="(//div[@class='image-wrap'])[1]")
	WebElement purchaseicon;
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement amounttextbox;
	
	@FindBy(xpath="//button[text()='Purchase']")
	WebElement purchasebutton;
	
    @FindBy(xpath="(//input[@type='number'])[1]")
    WebElement enteramounttransfer;
    
    @FindBy(xpath = "//button[text()='Quick Transfer']")
    WebElement clicktransfer;
	
	@FindBy(xpath="//img[@src='./../../../../assets/icons/back-btn.svg']")
	WebElement backbuttontransfersxreen;
	
	@FindBy(xpath = "//span[text()='My Balance']")
    WebElement dashboard;
	
	@FindBy(xpath="(//div[@class='image-wrap'])[2]")
	WebElement deposit;
	
	@FindBy(xpath="(//div[@class='image-wrap'])[6]")
	WebElement transferbuttonltc;
	
	@FindBy(xpath="//img[@src='./../../assets/icons/Group 483067.svg']")
	WebElement purchaseiconltc;
	
	@FindBy(xpath="(//div[@class='image-wrap'])[5]")
	WebElement depositltc;
	
	@FindBy(xpath="//span[text()='Purchase']")
	WebElement purchasescreen;
	
	@FindBy(xpath = "//img[@src='./../../assets/icons/copy-btn.svg']")
	WebElement copybutton;
	
	
	
	public dashboard(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void  button() {
		proceedbutton.click();
	}

	public void  Tbutton() {
		transferbutton.click();
	}
	public void  msgforbalance() {
	 if (notificationforlowbalnce.isDisplayed()) {
		 System.out.println("testcase is passed");
		 Reporter.log("passed-Even if available balance shows as zero then low balance massage should dispaly");
		 
		 
		 
		
	} else {
		 System.out.println("testcase is failed");
		 Reporter.log("failed- message does not dispalyed");

	}
	}
	public void  purchase1button() {
		purchasebutton.click();
	
}  
	public void purchasearrow() {
		purchaseicon.click();
	}
	
	public void enteramount() {
	    amounttextbox.sendKeys("10");
	}
	
	public void transferamount() {
	    enteramounttransfer.sendKeys("3");
	}
	
	public void quicktransferbutton() {
	    clicktransfer.click();
	}
	public void clickonback() {
	    backbuttontransfersxreen.click();
	}
	
	public void clickondeposit() {
	    deposit.click();
	}
	
	public void  Tbuttonltc() {
		transferbuttonltc.click();
	}
	public void  clickpurchaseiconltc() {
		purchaseiconltc.click();
	}
	public void  clickdepositltc() {
		depositltc.click();
	}
	
	public void backtodashbaoard() {
		 String expected_result = "My Balance";
		 Reporter.log("dashboard screen should be opened");
		 String actual_rsult = dashboard.getText();
		 Reporter.log("dashboard screen opened");
		 Assert.assertEquals(expected_result, actual_rsult);
		 Reporter.log("passed-back button is working ");
}
	public void backtopurchasescreen() {
		 String expected_result = "My Balance";
		 Reporter.log("dashboard screen should be opened");
		 String actual_rsult = purchasescreen.getText();
		 Reporter.log("dashboard screen opened");
		 Assert.assertEquals(expected_result, actual_rsult);
		 Reporter.log("passed-back button is working ");
}
	public void copybutton() {
 String attribute = copybutton.getAttribute("data_cliboard_target");
		
	}
	
	}
