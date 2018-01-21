import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.eclipse.jdt.internal.compiler.batch.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookvrf {
	public static void main(String[] args) throws Exception {
	WebDriver d = new FirefoxDriver();
	d.get("https://www.facebook.com/");
	WebElement facebooklogo = d.findElement(By.xpath("//i[@class='fb_logo img sp_ex0C8BIsLat sx_7401de']"));
	if(facebooklogo.isDisplayed()){
		System.out.println("logo is Present");
	}
	WebElement emailId= d.findElement(By.xpath("//input[@id='email']"));
	//verify emsil textbox
	if(emailId.isEnabled()){
		System.out.println("EmailId  is Present");
	}
	
	WebElement password= d.findElement(By.xpath("//input[@id='pass']"));
	if(password.isEnabled()){
		System.out.println("password  is Present");
	}
	WebElement firstname= d.findElement(By.xpath("//input[@name='firstname']"));
	if(firstname.isEnabled()){
		System.out.println("firstname  is Present");
	}
	WebElement surname= d.findElement(By.xpath("//input[@name='lastname']"));
	if(surname.isEnabled()){
		System.out.println("surname  is Present");
	}
	WebElement loginbutton= d.findElement(By.xpath("//input[@value='Log In']"));
	if(loginbutton.isEnabled()){
		System.out.println("loginbutton  is Present");
	}
	WebElement emailaddress= d.findElement(By.xpath("//input[@name='reg_email__']"));
	if(emailaddress.isEnabled()){
		System.out.println("emailaddress  is Present");
	}
  	WebElement newpassword= d.findElement(By.xpath("//input[@name='reg_passwd__']"));
  	if(newpassword.isEnabled()){
		System.out.println("newpassword is Present");
  	}
//		Select day= new Select(d.findElement(By.xpath("//select[@id= 'day']")));
//		day.selectByValue("30");
//		Select month= new Select(d.findElement(By.xpath("//select[@id= 'month']")));
//		month.selectByIndex(6);
//		Select year= new Select(d.findElement(By.xpath("//select[@id= 'year']")));
//		year.deselectByValue("1990");
//		
	
	List<WebElement> gender=d.findElements(By.xpath("//input[@name='sex']/following-sibling::label"));
	    for (WebElement webElement:gender){
		 System.out.println(webElement.getText().isEmpty());
		 
	 
	    if(webElement.isEnabled()){
	    	System.out.println("gender present");
	    }
	    }
//	   
//	PrintWriter a= new PrintWriter(new File("D:\\abc.txt"));
//	a.write(d.getPageSource());
//	a.close();
      d.close();
	
	
	Select day= new Select(d.findElement(By.xpath("//select[@id= 'day']")));
	List<WebElement> list=day.getOptions();
	for (WebElement element : list){
		System.out.println(element);
		d.findElement(By.xpath("")).sendKeys(Keys.CONTROL+"c");
		 
	}
	}
}
