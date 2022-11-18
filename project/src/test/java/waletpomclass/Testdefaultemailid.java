package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testdefaultemailid {
	WebDriver driver;
	
  @Test
  public void displayusermailid() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	 // WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6Im1hbm9nZWQ3ODVAbGFuY2U3LmNvbSIsImlhdCI6MTY2ODA2NzAxNiwiZXhwIjoxNjY4MDg4NjE2fQ.cq8ydJrdJsNL1VciH6jFj0_GJauGsmMKWD7nKkwmFnE");
		Thread.sleep(5000);
		 Nextbuttonforwelcomepage email=PageFactory.initElements(driver, Nextbuttonforwelcomepage.class);
		 email.getproceedbutton();
		 Thread.sleep(5000);
		 email.useremailaddress();
		
		
  }
}
