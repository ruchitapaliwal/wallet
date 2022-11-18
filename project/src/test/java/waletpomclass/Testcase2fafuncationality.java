package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcase2fafuncationality {
  WebDriver driver;
  @Test
  public void twofafunctionality() throws InterruptedException, EncryptedDocumentException, IOException {
	  //WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJ1Y2hpdGFwQG51MTAuY28iLCJpYXQiOjE2NjgxNDY5MDksImV4cCI6MTY2ODE2ODUwOX0.8fHjP6MdW-3RjmlHpPu3DH7bZskcc_J0IUaKBPwBckE");
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
		Thread.sleep(5000);
		Functionaty2fa f1=PageFactory.initElements(driver, Functionaty2fa.class);
		f1.clickonproceedbitton();
		Thread.sleep(5000);
		f1.clickhamburger();
		Thread.sleep(5000);
		f1.preferncebuttonn();
		Thread.sleep(5000);
		f1.twofaenable();
		Reporter.log("when 2fa is enable.verification popup should be opened");
		Thread.sleep(5000);
		f1.backtodashboard();
		Thread.sleep(5000);
		f1.purchaseicon();
		Thread.sleep(5000);
		f1.verificationpoppup();
		Thread.sleep(5000);
		driver.close();
  }
}
