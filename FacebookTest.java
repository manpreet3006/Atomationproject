import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTest {
	public static void main(String[] args) throws Exception {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com/");
		Select day= new Select(d.findElement(By.xpath("//select[@id= 'day']")));
	
		List<WebElement> list=day.getOptions();
		for (WebElement element : list){
			System.out.println(element.getText());
		}
	}
}
