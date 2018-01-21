import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDatePicker1 {
	public static void main (String args[]) throws InterruptedException{
		WebDriver d = new FirefoxDriver();
d.get("https://jqueryui.com/datepicker/");
		
		d.switchTo().frame(d.findElement(By.className("demo-frame")));
		
		d.findElement(By.id("datepicker")).click();
		
       WebElement next = d.findElement(By.xpath("//span[.='Next']"));
       WebElement   no   =d.findElement(By.xpath("//a[.=16]"));
		
		Actions action = new Actions(d);
		
	      for(int i =0; i< 10; i++){
			Thread.sleep(2000);
			next = d.findElement(By.xpath("//span[.='Next']"));
			action.click(next).build().perform(); 
		}
		
		
	}

}
