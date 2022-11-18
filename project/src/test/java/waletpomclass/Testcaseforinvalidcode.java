package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcaseforinvalidcode {
	WebDriver driver;
  @Test
  public void errormessageforinvalidcode() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	  //WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJ1Y2hpdGFwQG51MTAuY28iLCJpYXQiOjE2Njg0MTk3MzAsImV4cCI6MTY2ODQ0MTMzMH0.DWMEGcdZaw30-udWl2ZMv-05G3NCG1Pf19J0RVG4f6o");
		Thread.sleep(5000);
		Functionaty2fa f1=PageFactory.initElements(driver, Functionaty2fa.class);
		f1.clickonproceedbitton();
		Thread.sleep(5000);
		f1.clickhamburger();
		Thread.sleep(5000);
		f1.preferncebuttonn();
		Thread.sleep(5000);
		f1.twofaenable();
		Thread.sleep(5000);
		f1.backtodashboard();
		Thread.sleep(5000);
		f1.clickonpurchase();
		Thread.sleep(10000);
		f1.entercode1();
		Thread.sleep(5000);
		f1.verificationpoppup();
		Thread.sleep(5000);
		f1.errormessage();
		Thread.sleep(5000);
		driver.close();
		
		
		
  }
}
