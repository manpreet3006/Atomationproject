import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDownMethod {
	
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("https://paytm.com");
		 
     	JavascriptExecutor je =(JavascriptExecutor)d;
     	je.executeScript("scrollBy(0,2500)");
	}

}
