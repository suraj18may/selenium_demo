package key_board_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		WebElement input1=driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
		input1.sendKeys("Hello how are you");
//		WebElement input2=driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
		
//		
//		
//		Actions action=new Actions(driver);
//	
////		select the text ctrl+a
//		action.keyDown(Keys.CONTROL);
//		action.sendKeys("a");
//		action.keyUp(Keys.CONTROL);
//		action.build().perform();
//		
////		copy the text ctrl+a
//		action.keyDown(Keys.CONTROL);
//		action.sendKeys("c");
//		action.keyUp(Keys.CONTROL);
//		action.build().perform();
//		
////		press tab key
//		action.sendKeys(Keys.TAB);
//		
////		past the text ctrl+a
//		action.keyDown(Keys.CONTROL);
//		action.sendKeys("v");
//		action.keyUp(Keys.CONTROL);
//		action.build().perform();
//		
		
}
}