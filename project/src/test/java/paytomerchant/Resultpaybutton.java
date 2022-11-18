package paytomerchant;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomclass.Paymentmerchant;
import pomclass.Paymentreciept;

public class Resultpaybutton {
	static WebDriver driver;
	@BeforeClass
	public static void launchbrowser() throws InterruptedException {
		driver=Baseclass.Launchbrowserall("http://demo-web-alb-293560000.us-east-1.elb.amazonaws.com:3000/");
	}
	
	@BeforeMethod
	public void paybutton() {
		Paymentmerchant b1=PageFactory.initElements(driver, Paymentmerchant.class);
		b1.clickonpaymentbutton();
	}
	@Test
	public void entername() throws InterruptedException {
		Paymentreciept b2=PageFactory.initElements(driver, Paymentreciept.class);
	b2.namefield();
	}
	@AfterMethod
	public void zerror() throws InterruptedException {
		Paymentreciept b3=PageFactory.initElements(driver, Paymentreciept.class);
		b3.amountfield();
		b3.payonbutton();
		b3.balance1();
		Thread.sleep(3000);
	}
@AfterClass
public  static void cloesbrowser() {
	Reporter.log("test case is passed");
	System.out.println("test");
	driver.close();
}
}
