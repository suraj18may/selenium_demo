package slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {
	public static void main(String[] args) {
		
	
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	WebElement ele=driver.findElement(By.xpath("//*[@id=\"slider\"]"));
	
	
	System.out.println(ele.getLocation());
	
	Actions action=new Actions(driver);
	
	action.dragAndDropBy(ele, 50, 0).build().perform();
	
	
	System.out.println(ele.getLocation());
	
	
	
	
	
	}
}
