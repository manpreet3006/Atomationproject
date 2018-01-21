import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitwaitExample {
	public static void main (String args[]){
	WebDriver d = new FirefoxDriver();
	// for implicit wait
	  d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://paytm.com/dth-recharge");

	   WebElement operater = d.findElement(By.xpath("//input[@type='text']"));
		 operater.click();
	   WebElement	selectoperater =d.findElement(By.xpath("//div[@ng-repeat='operator in operators |brandFilter:operatorName']/span[contains(text(),'Airtel')]"));
	     selectoperater.click();
       WebElement	dtnumber= d.findElement(By.name("dthNumber"));
         dtnumber.sendKeys("3123456789");
       WebElement amount= d.findElement(By.xpath("//input[@ng-model='amount']"));
	     amount.sendKeys("300");
       WebElement proceedbutton	=d.findElement(By.xpath("//button/span[.='Proceed to Recharge']"));
	     proceedbutton.click();
	
	}

}
