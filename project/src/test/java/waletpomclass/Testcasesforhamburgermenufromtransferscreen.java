package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcasesforhamburgermenufromtransferscreen {
	WebDriver driver;
  @Test
  public void clickonhamburgermenufromtransferascren() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	  WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJhanVsZEBudTEwLmNvIiwiaWF0IjoxNjY4NDk5MjYyLCJleHAiOjE2Njg1MjA4NjJ9.H7tjJzDijjTyANeJ0mKsKqUDgzn9IqS8gtdqxwx2i54");
		Thread.sleep(5000);
		Functionaty2fa h1=PageFactory.initElements(driver, Functionaty2fa.class);
		h1.clickonproceedbitton();
		Thread.sleep(5000);
		h1.clickontransfer();
		Thread.sleep(5000);
		h1.clickhamburger();
		Thread.sleep(5000);
		h1.hamburgerpagedisplay();
		driver.close();
		
	  
  }
}
