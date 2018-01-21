import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class IncreandDecrement {
	public static void main (String args []) throws InterruptedException{
	WebDriver d= new FirefoxDriver();
	d.get("https://jqueryui.com/controlgroup/");
	
	d.switchTo().frame(d.findElement(By.className("demo-frame")));
	
	WebElement incre = d.findElement(By.xpath("//fieldset[1]//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']"));
	
	WebElement decre = d.findElement(By.xpath("//fieldset[1]//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-s']"));
	
	Actions action=new Actions(d);
	for(int i=0;i<10;i++){
	Thread.sleep(1000);
	action.click(incre).build().perform();
	
	}
	for(int i=0;i<10;i++){
		Thread.sleep(1000);
		action.click(decre).build().perform();
	}
	}
}
