package getstarted;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Strings;

import baseclass.Baseclass;
import waletpomclass.Login;

public class Getstartedbutton {
	WebDriver driver;


	@BeforeMethod
	public void openbrowser() throws InterruptedException {
		WebDriver driver = Baseclass.Launchbrowserall("http://demo-rt-cb-qa-alb-1696234791.us-east-1.elb.amazonaws.com/#/dev/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000)) ;	
		
		}
	@Test
	
	public void emailid() throws InterruptedException {
		Login l1=PageFactory.initElements(driver, Login.class);
		l1.entermailid("ruchitap@nu10.co");
		
		l1.checkbokbutton();
		}
	

	
	
		

}
	
