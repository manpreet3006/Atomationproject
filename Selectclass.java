import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("open firefox");
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://facebook.com");
		Thread.sleep(5000);
		Select day = new Select(d.findElement(By.id("day")));
		day.selectByIndex(0);
		//day.selectByVisibleText("14");
	//	day.selectByValue("28");
	//	d.quit();
		System.out.println(day.getOptions());
		}

}
