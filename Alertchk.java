import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertchk {
     public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://google.com/");
		Alert alert= d.switchTo().alert();
		alert.accept();
		
	}
     
}
