package waletpomclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.google.zxing.NotFoundException;

import baseclass.Baseclass;

public class Testcaseqrcode {
	 WebDriver driver;
	 
  @Test
  public void scanningqrcode() throws InterruptedException, NotFoundException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	  //WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJ1Y2hpdGFwQG51MTAuY28iLCJpYXQiOjE2Njg0MDYzODUsImV4cCI6MTY2ODQyNzk4NX0.7es6YEUGYWiXekSVwdQhuNtDPXGSWHuGxiD17rUGztg");
		Thread.sleep(5000);
		QRcode q=PageFactory.initElements(driver, QRcode.class);
		q.proceedbuttonqr();
		Thread.sleep(5000);
		q.depositbuttonqr();
		Thread.sleep(5000);
		q.scanqrcode();
		
  }
}
