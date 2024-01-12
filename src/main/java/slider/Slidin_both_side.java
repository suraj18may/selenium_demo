package slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slidin_both_side {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/sliders/#Color%20Picker");
	
	driver.findElement(By.xpath("//*[@id=\"Range\"]")).click();
	
	 WebElement element=driver.findElement(By.xpath("//*[@id=\"post-2673\"]/div[2]/div/div/div[2]/p/iframe"));
	 Thread.sleep(5000);
	 
	driver.switchTo().frame(element);
	Thread.sleep(5000);
	
	WebElement ele1=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
	WebElement ele2=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
//	before moving
	System.out.println(ele1.getLocation());
	System.out.println(ele2.getLocation());
	
	
	Actions action=new Actions(driver);
//	
	action.dragAndDropBy(ele1, 50, 0).build().perform();
	action.dragAndDropBy(ele2, -50, 0).build().perform();
//	after moving
	System.out.println(ele1.getLocation());
	System.out.println(ele2.getLocation());

	}
}
