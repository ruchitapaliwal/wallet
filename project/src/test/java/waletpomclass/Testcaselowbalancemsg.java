package waletpomclass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcaselowbalancemsg {
  WebDriver driver;
	@BeforeClass
  
	  public void launchurl() throws InterruptedException, EncryptedDocumentException, IOException {
		//driver=Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJ1Y2hpdGFwQG51MTAuY28iLCJpYXQiOjE2Njc4OTUxNDQsImV4cCI6MTY2NzkxNjc0NH0.H04YWqDCSJejOLcUCbMjET4L9WSN2lDNo_O5WEoeCCE");
		driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
		Thread.sleep(5000);
			}
	@Test
       public void lowbalncemsg() throws InterruptedException {
    	   dashboard t1=PageFactory.initElements(driver, dashboard.class);
 
    	   t1.button();
    	   Thread.sleep(5000);
    	   t1.Tbutton();
    	   Reporter.log("when user click on transfer button");
    	   Thread.sleep(3000);
    	   t1.msgforbalance();
    	   Thread.sleep(3000);
    	   t1.purchase1button();
    	   Reporter.log("passed-purchase button is working");
    	   Thread.sleep(3000);
    	   driver.close();
       }
}
