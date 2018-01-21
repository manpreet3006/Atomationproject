import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplecitWaitExample {
	public static void main (String args[]){
		WebDriver d = new FirefoxDriver();
			d.get("https://paytm.com/dth-recharge");
			
			
		   WebDriverWait wait = new WebDriverWait(d, 120);
	         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='operatorDDl']")));

		   WebElement operater = d.findElement(By.xpath("//input[@name='operatorDDL']"));
			 operater.click();
		   WebElement	selectoperater =d.findElement(By.xpath("//input[@type='text' and @ value='Dish TV']"));
		     selectoperater.click();
	    //   WebElement	dtnumber= d.findElement(By.name("dthNumber"));
	      //   dtnumber.sendKeys("3123456789");
	      // WebElement amount= d.findElement(By.xpath("//input[@ng-model='amount']"));
		    // amount.sendKeys("300");
	      // WebElement proceedbutton	=d.findElement(By.xpath("//button/span[.='Proceed to Recharge']"));
		    // proceedbutton.click();
		
		}


}
