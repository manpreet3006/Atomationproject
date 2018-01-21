import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class GetalllinkFrompage {
	public static void main (String args []){
		
		WebDriver d = new FirefoxDriver ();
		d.get("http://google.com/");
	List<WebElement> link= d.findElements(By.tagName("a"));
	for(WebElement WebElement:link){
		System.out.println(WebElement.getText()+" "+WebElement.getAttribute("href"));
	}
	
	
	}

}
