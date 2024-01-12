package resize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resize {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		 
		 System.out.println(element.getLocation());
		
		 Actions action = new Actions(driver);
		 
		 action.dragAndDropBy(element, 40, 20).build().perform();
		 
		 System.out.println(element.getLocation());
	}

}
