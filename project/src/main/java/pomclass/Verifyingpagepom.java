package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Verifyingpagepom {
WebDriver driver;
	
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proceedbutton;
	
	public Verifyingpagepom (WebDriver driver) {
		this.driver=driver;
	}
	
	public void CLickonProceedbutton() {
		
		proceedbutton.click();
	}
}
