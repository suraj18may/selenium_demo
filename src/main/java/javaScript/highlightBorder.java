package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class highlightBorder {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		 WebElement value=driver.findElement(By.id("name"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("document.getElementById('name').setAttribute('style','border:2px solid red; background:yellow');");
		
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow');",value);
		Thread.sleep(2000);
//		Un Highlight
		js.executeScript("arguments[0].setAttribute('style','border:; background:');",value);
		
		driver.close();
	}

}
