import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDiagonal {
	  public static void main (String args []){
		  WebDriver driver =new FirefoxDriver();
		  diagonal(driver);
	  }
      public static void diagonal(WebDriver d){
    	  d.get("http://jqueryui.com/dialog/");
    	  d.switchTo().frame(d.findElement(By.className("demo-frame")));
    	  WebElement dialog =d.findElement(By.xpath("//div[@ class='ui-resizable-handle ui-resizable-ne']"));
    	  Actions action= new Actions(d);
    	  action.clickAndHold(dialog).moveByOffset(100, 00).release().build().perform();
      }
}
