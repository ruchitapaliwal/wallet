package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcaselowbalancemsgforltc {
 
  WebDriver driver;
	@BeforeClass

	  public void launchurl() throws InterruptedException, EncryptedDocumentException, IOException {
		 // driver=Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJ1Y2hpdGFwQG51MTAuY28iLCJpYXQiOjE2Njc0NDkzMTIsImV4cCI6MTY2NzQ3MDkxMn0.bwevdOfV8jrSgwSyd7KYiHUNTu_qSxKnNCZdIr8Sn_8");
		driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
		Thread.sleep(7000);
			}
	@Test
     public void lowbalncemsgltc() throws InterruptedException {
  	  Transferforltc t2=PageFactory.initElements(driver,Transferforltc.class );

  	   t2.buttonltc();
  	   Thread.sleep(5000);
  	   t2.Tbuttonltc();
  	   Thread.sleep(3000);
  	   t2.msgforbalanceltc();
  	   Thread.sleep(3000);
  	   t2.purchase1buttonltc();
  	   Thread.sleep(3000);
  	   driver.close();
     }


}
