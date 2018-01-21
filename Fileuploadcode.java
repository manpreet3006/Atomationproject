import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileuploadcode {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		WebElement image = driver.findElement(By.xpath("//a[.='Images']"));
		image.click();
		Thread.sleep(10000);
	
		WebElement photo = driver.findElement(By.xpath("//span[@id='qbi']"));
		photo.click();
		WebElement uploadimage = driver.findElement(By.xpath("//a[.='Upload an image']"));
		uploadimage.click();
		Runtime.getRuntime().exec("D:\\Fileupload.exe");
		WebElement chosefile = driver.findElement(By.xpath("//input[@id= 'qbfile']"));
		//chosefile.sendKeys("C:\\Users\\MANPREET\\workspace1\\automation project\\src\\17799479_1295580343852797_5465309747959169848_n.jpg");
	    chosefile.sendKeys("AutoIT in Selenium");
	    
	}

}
