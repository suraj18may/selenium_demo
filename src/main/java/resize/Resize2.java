package resize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resize2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
//		WebElement ele=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		
		driver.switchTo().frame(0);
	
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		 
		 System.out.println(element.getLocation());
		
		 Actions action = new Actions(driver);
		 
		 action.dragAndDropBy(element, 200,40).build().perform();
		 
		 System.out.println(element.getLocation());
	}

}
