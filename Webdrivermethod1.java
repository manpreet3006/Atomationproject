 
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdrivermethod1 {
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANPREET\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.amazon.in/s/ref=nb_sb_ss_i_3_6?url=search-alias%3Daps&field-keywords=iphone+7&sprefix=iphone%2Caps%2C308&crid=132ZNUJY755N7");
	String parentWindow=d.getWindowHandle();
	System.out.println("Window handle of parent :"+parentWindow);
	Thread.sleep(2000);
	WebElement link = d.findElement(By.xpath("//a[@title='Apple iPhone 7 (Jet Black, 128GB)']"));
	link.click();
	//To get the window handles
	Set<String> handles= d.getWindowHandles();
	Iterator itr= handles.iterator();
	itr.next();
   String window4 =("itr.next()");
    
	
//	  for(String child:handles ){
//     	if(!parentWindow.equals(child)){
//			d.switchTo().window(child);
//			System.out.println("Switched : " +child);
//		}
//	}
//		WebElement addToCart =  d.findElement(By.id("add-to-cart-button"));
//		addToCart.click();

	}
	}
	

