import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragandDropable {
	public static void main(String args[]) {
		WebDriver dr= new FirefoxDriver();
		dr.manage().window().maximize();
		dragNDroppable(dr);
		
	}
	public static void dragNDroppable(WebDriver d){
		d.get("http://jqueryui.com/droppable/#accepted-elements");
		d.switchTo().frame(d.findElement(By.className("demo-frame")));
		WebElement drag =d.findElement(By.id("draggable"));	
        WebElement drop =d.findElement(By.id("droppable"));
        Actions action=new Actions(d);
        action.dragAndDrop(drag, drop).build().perform();
	}

}
