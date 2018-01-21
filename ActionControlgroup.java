import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionControlgroup {
	public static void main (String args[] ){
	  	  WebDriver driver= new FirefoxDriver();
	  	  controlgroup(driver);
		}
		public static void controlgroup(WebDriver d){
			d.get("http://jqueryui.com/controlgroup/");
			d.switchTo().frame(d.findElement(By.className("demo-frame")));
			WebElement triangle =d.findElement(By.xpath("//span[@ class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']"));
		    WebElement fullcar =d.findElement(By.xpath("//div[@id='ui-id-3']"));
            WebElement   automatic =d.findElement(By.xpath("//label[@for='transmission-automatic']"));
            WebElement   insurance =d.findElement(By.xpath("//label[@for='insurance']"));
            WebElement   ofcar= d.findElement(By.xpath("//input[@id='horizontal-spinner']"));
            WebElement  book  = d.findElement(By.xpath("//button[@ class='ui-widget ui-controlgroup-item ui-button ui-corner-right']"));        
            Actions action =new Actions(d);
       action.click(triangle).click(fullcar).click(automatic).click(insurance).click(ofcar).sendKeys(ofcar, "5").clickAndHold(book).build().perform();
}
}
