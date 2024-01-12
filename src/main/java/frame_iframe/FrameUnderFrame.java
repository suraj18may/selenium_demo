package frame_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameUnderFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		WebElement outerFrame=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerFrame);
		
		WebElement innerFrame=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerFrame);
		
		WebElement innertext=driver.findElement(By.xpath("//input[@type='text']"));
		innertext.sendKeys("Wellcome to Inner frame Text");
	
		System.out.println(innertext.getAttribute("value"));
		
		driver.close();
		
	}

}
