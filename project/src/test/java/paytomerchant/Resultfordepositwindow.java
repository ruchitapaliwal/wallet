package paytomerchant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomclass.Paymentmerchant;
import pomclass.Paymentreciept;

public class Resultfordepositwindow {
	WebDriver driver;
	@Test
	public void paymentbutton() throws InterruptedException {
		driver=Baseclass.Launchbrowserall("http://demo-web-alb-293560000.us-east-1.elb.amazonaws.com:3000/");
		
		Paymentmerchant p2=PageFactory.initElements(driver, Paymentmerchant.class);
		p2.clickonpaymentbutton();
		
		Paymentreciept p3=PageFactory.initElements(driver, Paymentreciept.class);
		p3.namefield();
		p3.amountfield();
		Thread.sleep(3000);
		p3.payonbutton();
		Thread.sleep(5000);
		p3.balance1();
		driver.close();	
	}

}
