import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDaterPicker {
	public static void main (String args[]) throws InterruptedException{
		WebDriver driver= new FirefoxDriver();
		datepicker(driver);
	}
    public static void datepicker(WebDriver d) throws InterruptedException  {
    	d.get("http://jqueryui.com/datepicker/");
    	d.switchTo().frame(d.findElement(By.className("demo-frame")));
    	WebElement date =d.findElement(By.xpath("//input[@id='datepicker']"));
    	date.click();
    	//Thread.sleep(1000);
    	WebElement nextm  =d.findElement(By.xpath("//a[@data-handler='next']"));
    	nextm.click();
    	Thread.sleep(1000);
    	WebElement   no   =d.findElement(By.xpath("//a[.=16]"));
    	
    	Actions action= new Actions(d);
    	action.click(no).build().perform();
    }
}
