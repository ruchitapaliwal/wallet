package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcaseforltctransferbutton {
	WebDriver driver;
	
  @Test
  public void transferbuttonfunctionalityltc() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	  WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJhanVsZEBudTEwLmNvIiwiaWF0IjoxNjY4MDU1NTcxLCJleHAiOjE2NjgwNzcxNzF9.bUx94MGSvLCGw-mfZGuhi80MN-T5fIU0aWwGy-AfFvs");
		Thread.sleep(5000);
		Transferforltc t1 =PageFactory.initElements(driver,Transferforltc.class);
		t1.buttonltc();
		Thread.sleep(5000);
		t1.Tbuttonltc();
		Thread.sleep(5000);
		t1.transferamountltc();
		Thread.sleep(5000);
		//t1.quicktranferbuttonltc();
		driver.close();
	  
  }
}
