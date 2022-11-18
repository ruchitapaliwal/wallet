package waletpomclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Testcasefornextbuttondisablle {
	WebDriver driver;
  @Test
  public void nextbuttondisable() throws InterruptedException, EncryptedDocumentException, IOException {
	  driver=Baseclass.Nivapay_Wallet_launch(0, 0, null);	
	 // WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImNvcHVoaWxvQGtlbGx5Y2hpYmFsZS1yZXNlYXJjaGdyb3VwLXVjdC5jb20iLCJpYXQiOjE2Njc5MDQ4NDksImV4cCI6MTY2NzkyNjQ0OX0.5PLOsqachlVvRIH-0INf39IH9VDCXZeKV2nBJjR1KgM");
		Thread.sleep(5000);
		Nextbuttonforwelcomepage t1 =PageFactory.initElements(driver,Nextbuttonforwelcomepage.class);
		  t1.getproceedbutton();
		  Thread.sleep(5000);
			
		  //t1.firstnametext();
		  //Thread.sleep(5000);
			
		  t1.lastnametext();
		  Thread.sleep(5000);
			
		  t1.countryselected();
		  Thread.sleep(5000);
			
		  t1.dateselecctfromcalander();
		  Thread.sleep(5000);
			
		  t1.year();
		  Thread.sleep(5000);
			
		  t1.arrowselect();
		  Thread.sleep(5000);
			
		  t1.selectyear1();
		  Thread.sleep(5000);
		  
			
		  t1.selectmos();
		  Thread.sleep(5000);
			
		  t1.date();
		  Thread.sleep(5000);
			
		//  t1.nextbutton3();
		 // Thread.sleep(5000);
		  t1.nextdisable();
		  Thread.sleep(5000);
		  
			
  }
}
