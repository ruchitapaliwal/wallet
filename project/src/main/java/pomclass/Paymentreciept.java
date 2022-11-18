package pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Paymentreciept {
	WebDriver driver;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement entername;
	
	@FindBy(xpath="(//input[@type='number'])[1]" )
	WebElement enteramount;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement paybutton;
	
	@FindBy(xpath="//p[text()='Amount is required']")
	WebElement errormsg;
	
	@FindBy(xpath = "//button[text()='Pay with NivaPay Wallet']")
	WebElement paywithnivapaywalletbutton;
	
	
	
	public Paymentreciept(WebDriver driver) {
		this.driver=driver;
		
	}
	public void namefield() throws InterruptedException {
		 Actions act= new Actions(driver);
		 Thread.sleep(2000);
			act.click(entername).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(2000);
			entername.sendKeys("ruchita");
		}
	public void amountfield() throws InterruptedException {
	  Actions act= new Actions(driver);
	 Thread.sleep(2000);
		act.click(enteramount).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
	enteramount.sendKeys("3");
	Thread.sleep(5000);
	}
	public void wallet() {
	if (paywithnivapaywalletbutton.isEnabled()) { 
		System.out.println("button is enabled");
		
	}
	else {
		System.out.println("button is disabled");
		
		
	}
		
	}
	public void balance1() {
		WebElement one = driver.findElement(By.xpath("(//h6[@class='MuiTypography-root MuiTypography-h6 css-8d3d11-MuiTypography-root'])[2]"));
		String btc = one.getText();
		System.out.println(btc);
	}
	
//	public void errormsg() throws InterruptedException {
//		 Actions act= new Actions(driver);		 Thread.sleep(2000);
//	act.click(enteramount).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
//		Thread.sleep(5000);
//		Boolean msg= errormsg.isDisplayed();
//		 if(msg) {
//	           System.out.println("Yes ! Element is Present");
//	     }
//		     else {
//		           System.out.println("NO ! Element is not Present");
//		     }
//	}
public void payonbutton() {
paybutton.click();
//		
	}
//	
	
	
	

}
