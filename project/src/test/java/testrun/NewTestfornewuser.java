package testrun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import waletpomclass.Date;
import waletpomclass.Newuser;

;

public class NewTestfornewuser {
	WebDriver driver;
  @BeforeClass
  
  public void launchurl() throws InterruptedException {
	  driver=Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6Im1vbG11bGlya2lAdnVzcmEuY29tIiwiaWF0IjoxNjY2ODQ4Njc0LCJleHAiOjE2NjY4NzAyNzR9.y1P6UzNuCHpRdXkWqW7Hn64kBnkzzTqfJL3856Qr-sI");
		Thread.sleep(5000);
  }
  
  @Test
   public void username() throws InterruptedException {
	  Newuser fname = PageFactory.initElements(driver, Newuser.class);
	  fname.proceedbutton1();
	  Thread.sleep(3000);
	  fname.firstname1();
	  Thread.sleep(3000);
	  fname.lastname1();
	  Thread.sleep(3000);
	  fname.msgshows();
	  Thread.sleep(3000);

  }
	
	 

	 
	  
	  
	  
	  
  
  
  
  
  
}
