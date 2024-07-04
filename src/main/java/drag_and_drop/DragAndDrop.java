package drag_and_drop;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement target1=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target2=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(target1, target2).build().perform();
		
		
	}

}
