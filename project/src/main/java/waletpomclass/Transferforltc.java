package waletpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Transferforltc {
	
		WebDriver driver;
		@FindBy(xpath="//button[text()='Proceed']")
		WebElement proceedbuttonltc;
		
		@FindBy(xpath="(//div[@class='image-wrap'])[6]")
		WebElement transferbuttonltc;
		
		@FindBy(xpath="//h3[@class='ng-star-inserted']")
		WebElement notificationforlowbalnceltc;
		
		@FindBy(xpath="//button[text()='Purchase'] ")
		WebElement purchasebuttonltc;
		
		@FindBy(xpath = "(//input[@type='number'])[1]")
		WebElement enteramountltc;
		
		@FindBy(xpath="//button[text()='Quick Transfer']")
		WebElement quicktransferbuttonltc;
		
		
		
		
		
		public Transferforltc() {
			this.driver=driver;
			
		}
		
		public void  buttonltc() {
			proceedbuttonltc.click();
		}

		public void  Tbuttonltc() {
			transferbuttonltc.click();
		}
		public void  msgforbalanceltc() {
		 if (notificationforlowbalnceltc.isDisplayed()) {
			 System.out.println("testcase is passed");
			 
			 
			 
			
		} else {
			 System.out.println("testcase is failed");

		}
		}
		public void  purchase1buttonltc() {
			purchasebuttonltc.click();
		
	}
		public void transferamountltc() {
			enteramountltc.click();
		
	}
		public void quicktranferbuttonltc() {
			quicktransferbuttonltc.click();
		
	}
		}



