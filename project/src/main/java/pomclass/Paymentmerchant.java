package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Paymentmerchant {
	WebDriver driver;
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth makeStyles-btn-7 css-1w7vxcu-MuiButtonBase-root-MuiButton-root'][1]")
	WebElement paybutton;
	
	
	public Paymentmerchant(WebDriver driver) {
	
	this.driver=driver;

}
	public void clickonpaymentbutton() {
		paybutton.click();
	}
	

}
