import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerthandling1 {
	public static void main (String args[]){
		WebDriver d=new FirefoxDriver();
		d.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		d.switchTo().frame(d.findElement(By.id("iframeResult")));
		d.findElement(By.tagName("button")).click();
		Alert alert = d.switchTo().alert();
		System.out.println(alert.getText());
	
		alert.accept();
		
	}

}
