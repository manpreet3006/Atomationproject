
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionDragNdrop {
	public static void main (String args[]){
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		drangAndDrop(dr);
	}
		
	public static void drangAndDrop(WebDriver d){
		d.get("http://jqueryui.com/draggable/");
		d.switchTo().frame(d.findElement(By.className("demo-frame")));
		 WebElement drag = d.findElement(By.className( "ui-widget-content ui-draggable ui-draggable-handle"));
		 Actions action=new Actions(d);
		 action.clickAndHold().moveByOffset(100, 100).release().build().perform();
		
		
		
		
	}
	}
	


