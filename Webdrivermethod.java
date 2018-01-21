import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdrivermethod {
	/**
	 * @param agrs
	 */
	public static void main(String agrs[]){
	WebDriver d =new FirefoxDriver ();
	// to open the Url
       d.get("https://www.facebook.com");
    // to open the current url   
	    System.out.println("Current url is:"+d.getCurrentUrl());
	//to get the title
	    System.out.println("Title is:"+d.getTitle());
	//to get the list of web element object  
            List<WebElement>  gender= d.findElements(By.xpath("//input[@name='sex']/following-sibling::label"));
               for (WebElement webElement : gender) {
  		System.out.println(webElement.getText());
  		
       		}
	//to get single element 
	    WebElement email= d.findElement(By.id("email"));
	         email.sendKeys("manny3006@gmail.com");
	//to open source code
	     System.out.println("page source code is:"+d.getPageSource());
	//to close the current tab
	//d.close();
	}


	}	
	



