package paytomerchant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomclass.Paymentmerchant;
import pomclass.Paymentreciept;

public class Newresult {
	static WebDriver driver;
	@BeforeClass
	public static void launchbrowser() throws InterruptedException {
		driver=Baseclass.Launchbrowserall("http://demo-web-alb-293560000.us-east-1.elb.amazonaws.com:3000/");
		Thread.sleep(8000);
	}
	
	@Test (priority = 1)
	public void app() throws InterruptedException {
		Paymentmerchant b1=PageFactory.initElements(driver, Paymentmerchant.class);
		b1.clickonpaymentbutton();
		Thread.sleep(5000);
	}
	@Test (priority = 2)
	public void entername() throws InterruptedException {
		Paymentreciept b2=PageFactory.initElements(driver, Paymentreciept.class);
	b2.namefield();
	Thread.sleep(3000);

	}
	
//	@Test
//	public void wamountfield() throws InterruptedException {
//		Paymentreciept b4=PageFactory.initElements(driver, Paymentreciept.class);
//	b4.errormsg();
//	Thread.sleep(3000);

	//}
	@Test (priority = 3)
	
	public void amountfield() throws InterruptedException{
		Paymentreciept b5=PageFactory.initElements(driver, Paymentreciept.class);
		b5.amountfield();
		Thread.sleep(3000);
		
		
	}
	
@Test (priority = 4)
	
	public void deposit() throws InterruptedException{
		Paymentreciept b6=PageFactory.initElements(driver, Paymentreciept.class);
		b6.payonbutton();
		Thread.sleep(3000);
		
	}

@Test (priority = 5)

public void amountusd() throws InterruptedException{
	Paymentreciept b7=PageFactory.initElements(driver, Paymentreciept.class);
	b7.balance1();
	
	Thread.sleep(4000);
	
}
@Test (priority = 6)

public void userwallet() throws InterruptedException{
	Paymentreciept b8=PageFactory.initElements(driver, Paymentreciept.class);
	b8.wallet();
	
	Thread.sleep(4000);
	
}
	

	

	
@AfterClass
public  static void zcloesbrowser() {
	System.out.println("test");
	driver.close();
}
}



