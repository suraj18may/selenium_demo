package javaScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageScrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		ScrollDown page by Pixel.................
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,1000)");
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,1000)");
//		
		
//		ScrollDown page  till the element is visible
//		WebElement ele=driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[5]/label"));
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",ele);
//		Thread.sleep(2000);
		
//		ScrollDown page  till the end
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(2000);
//		Scroll up to starting position
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		Thread.sleep(2000);
		
//		scroll to element location
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[5]/label"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(arguments[0],arguments[1])",ele.getLocation().x,ele.getLocation().y);
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
