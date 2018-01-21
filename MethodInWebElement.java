import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodInWebElement {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http:facebook.com");
		WebElement id =d.findElement(By.xpath("//input[@type='email']"));
		System.out.println("Attribute is :"+id.getAttribute("data-testid"));
		System.out.println("Css value is :"+id.getCssValue("email"));
		System.out.println("Location is"+id.getLocation());
		System.out.println("size of element "+id.getTagName());
		
	}

}
