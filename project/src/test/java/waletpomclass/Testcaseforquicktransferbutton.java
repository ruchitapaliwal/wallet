package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcaseforquicktransferbutton {
	WebDriver driver;
  @Test
  public void quicktransferbuttonfunctionality() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	  WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJhanVsZEBudTEwLmNvIiwiaWF0IjoxNjY4MDU1NTcxLCJleHAiOjE2NjgwNzcxNzF9.bUx94MGSvLCGw-mfZGuhi80MN-T5fIU0aWwGy-AfFvs");
		Thread.sleep(5000);
		dashboard t1 =PageFactory.initElements(driver,dashboard.class);
		t1.button();
		Thread.sleep(5000);
		t1.Tbutton();
		Thread.sleep(5000);
		t1.transferamount();
		Thread.sleep(5000);
		//t1.quicktransferbutton();
		driver.close();
	  
  }
}
