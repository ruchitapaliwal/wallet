package waletpomclass;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class QRcode {
	WebDriver driver;
	@FindBy(xpath="//img[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAJQAAACUCAYAAAB1PADUAAAAAklEQVR4AewaftIAAATCSURBVO3BQW4ERxIEwfDC/P/LvjzmqYBG53ApKczwR6qWnFQtOqladFK16KRq0UnVopOqRSdVi06qFp1ULTqpWnRSteikatFJ1aKTqkUnVYs+eQnIb1LzlwCZ1NwAuVEzAflNat44qVp0UrXopGrRJ8vUbALyBpAn1ExAngByo2YC8oSaTUA2nVQtOqladFK16JMvA/KEmieA3Kh5Q80mIJOaN4A8oeabTqoWnVQtOqla9Mm/jJoJyBtqJiBPqJnUTEAmNf9kJ1WLTqoWnVQt+uQ/Rs0EZFIzAZnU3ACZgPyXnFQtOqladFK16JMvU/OXALkBMqmZgLyhZpOav+SkatFJ1aKTqkWfLAPyl6mZgExqJiCTmgnIpGYCcgNkUnMD5C87qVp0UrXopGrRJy+p+UuATGo2AXkDyBNq/klOqhadVC06qVr0yUtAJjUTkE1qJjVPAJnUTEDeADKpuQFyA2STmm86qVp0UrXopGrRJy+pmYBMam6ATGr+n9Q8AeQJIN+k5gkgk5o3TqoWnVQtOqlahD/yhwG5UTMBmdTcANmkZgIyqbkBMql5Asik5jedVC06qVp0UrXok18GZFIzAZnU/CY1m9RMQG7UTEAmNX/ZSdWik6pFJ1WLPnkJyKRmE5BJzQTkCSCTmgnIE2omIJOaGzU3at4AcqNm00nVopOqRSdVi/BHFgGZ1ExAnlDzBJAbNROQJ9RMQCY1N0C+Sc0EZFIzAZnUvHFSteikatFJ1SL8kUVAJjU3QJ5QMwF5Q80EZFIzAblR801AnlAzAZnUbDqpWnRSteikatEnf5yaCciNmieATGqeUHMDZFJzA+RGzQ2QGzUTkEnNGydVi06qFp1ULfrkJSDfBGRScwNkUjMBuQFyo2YC8gaQGzUTkEnNpGYCcqNm00nVopOqRSdViz75MiCTmknNG0AmNROQb1LzBJAbNROQSc0EZFLzBJBJzRsnVYtOqhadVC3CH3kByKRmAnKj5gbIpGYCcqPmBsik5gbIjZoJyKRmAnKj5gkgN2q+6aRq0UnVopOqRZ/8MjU3QCY1E5AbNROQSc0bat4A8gSQSc2NmhsgN2reOKladFK16KRq0SdfpuYNIDdqJiA3QCY1E5BNam6APAFkk5pNJ1WLTqoWnVQtwh/5BwPyhJoJyKTmDSBvqHkCyKTmBsiNmjdOqhadVC06qVr0yUtAfpOaSc0NkBs1TwCZ1HwTkEnNDZAbNd90UrXopGrRSdWiT5ap2QTkBsik5gbIpOYGyKTmRs0E5A01b6iZgNyoeeOkatFJ1aKTqkWffBmQJ9RsUnMDZFIzqZmAPKHmBsgE5A01E5DfdFK16KRq0UnVok/+ZYBMaiYgk5oJyKRmUjMBmdRMQCY1N2pugExq/pKTqkUnVYtOqhZ98h+jZgLyBJBJzQRkUjMBmdRMQJ4AMql5Qs2mk6pFJ1WLTqoWffJlar5JzRtqboBMaiYgk5oJyA2QSc0TQG7UTEC+6aRq0UnVopOqRZ8sA/KbgHyTmhs1E5BJzRNAbtRMaiYgN2q+6aRq0UnVopOqRfgjVUtOqhadVC06qVp0UrXopGrRSdWik6pFJ1WLTqoWnVQtOqladFK16KRq0UnVopOqRf8DAyUwM0aYJXwAAAAASUVORK5CYII=']")
     WebElement qrcodeurl;
	
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement proceedbutton;
	
	@FindBy(xpath="(//div[@class='image-wrap'])[2]")
	WebElement deposit;
	
	
	public QRcode() {
		this.driver=driver;
	}
	
    public void scanqrcode() throws IOException, NotFoundException {
    	String src1 = qrcodeurl.getAttribute("src");
    	URL url=new URL(src1);
    	
    	BufferedImage bufferedimage=ImageIO.read(url);
    	LuminanceSource luminancesource= new BufferedImageLuminanceSource(bufferedimage);
    	BinaryBitmap binarybitmap=new BinaryBitmap(new HybridBinarizer(luminancesource));
    	Result result=new MultiFormatReader().decode(binarybitmap);
    	System.out.println(result.getText());
    	
    }
    
    public void proceedbuttonqr() {
    	proceedbutton.click();
    	
    }
    public void depositbuttonqr() {
    	deposit.click();
    	
    }
    
}
