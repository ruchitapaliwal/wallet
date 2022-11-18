package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testbackfromdeposit {
  WebDriver driver;
  @Test
  public void backfromdeposit() throws InterruptedException, EncryptedDocumentException, IOException {
	  //WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJhanVsZEBudTEwLmNvIiwiaWF0IjoxNjY4MTUzMTI3LCJleHAiOjE2NjgxNzQ3Mjd9.lFuQJBHB6pC0Tv4lsV19H0djjQ-_-gNnd5oePoX3w_0");
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
			Thread.sleep(5000);
			dashboard b1=PageFactory.initElements(driver, dashboard.class);
			b1.button();
			Thread.sleep(5000);
			b1.clickondeposit();
			Thread.sleep(5000);
			b1.clickonback();
			Reporter.log("when user click on backbutton on prchase screen");
			Thread.sleep(5000);
			b1.backtodashbaoard();
			Thread.sleep(5000);
			driver.close();
  }
}
