
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toopenchrome {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANPREET\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
	}

}
