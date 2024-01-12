package frame_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_Frame {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Hello");
		System.out.println(text.getAttribute("value"));
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
