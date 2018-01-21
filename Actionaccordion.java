import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionaccordion {
	public static void main (String args[] ){
	  	  WebDriver driver= new FirefoxDriver();
	  	  accordion(driver);
		}
		public static void accordion(WebDriver d){
			d.get("http://jqueryui.com/accordion/");
			List<WebElement> list = d.findElements(By.xpath("//iframe"));
			System.out.println(list.size());
			
			d.switchTo().frame(d.findElement(By.className("demo-frame")));
			WebElement section =d.findElement(By.xpath("//h3[@id='ui-id-3']"));
			Actions action= new Actions(d);
			action.click(section).build().perform();
		
		}
}
