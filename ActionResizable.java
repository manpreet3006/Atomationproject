import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionResizable {
	public static void main(String args[] ){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		resizable(driver);
}
	public static void resizable(WebDriver d){
		d.get("http://jqueryui.com/resizable/");
		d.switchTo().frame(d.findElement(By.className("demo-fame")));
		WebElement  resize = d.findElement(By.xpath("//div[contains(@class,'diagonal')]"));
		Actions action=new Actions(d);
		action.click(resize).moveByOffset(100, 100).release().build().perform();
		
	}
}
