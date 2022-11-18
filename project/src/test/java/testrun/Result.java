package testrun;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomclass.Verifyingpagepom;

public class Result {
	WebDriver driver;
	@BeforeMethod
	public void openbrowser() throws InterruptedException {
	WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/account/email-confirmation?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InJ1Y2hpdGFwQG51MTAuY28iLCJpYXQiOjE2NjMxNzc1MDYsImV4cCI6MTY2MzE5OTEwNn0.CfYCWsSVZ8Si_escy1_hZK-iWKBGlVNFLvZtNhs1484");
	Thread.sleep(5000);	
	
	}
  @Test
 
	  public void clickonbutton() {
	  Verifyingpagepom p1=PageFactory.initElements(driver, Verifyingpagepom.class);
	  p1.CLickonProceedbutton();
	    	
	    }
  }

