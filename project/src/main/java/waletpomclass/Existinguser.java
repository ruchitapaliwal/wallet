package waletpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Existinguser {
	WebDriver driver;
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proceedbutton;
	
	
	public Existinguser(WebDriver driver) {
		this.driver=driver;
	}
    public void button() throws InterruptedException {
    	proceedbutton.click();
    	Thread.sleep(3000);
    }
}
