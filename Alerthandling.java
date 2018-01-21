import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerthandling {
	public static void main (String args []) throws InterruptedException{
		WebDriver d= new FirefoxDriver();
		d.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		d.switchTo().frame(d.findElement(By.id("iframeResult")));
		d.findElement(By.tagName("button")).click();
		Alert alert =d.switchTo().alert();
		Thread.sleep(5000);
		alert.dismiss();
		System.out.println("this is dismiss");
		
	}

}
