package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendValueGetValue {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		 WebElement value=driver.findElement(By.id("name"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		send the value
//		js.executeScript("document.getElementById('name').value='Mrinal Mishra'");
//		return value
//		String value=(String) js.executeScript(" return document.getElementById('name').value");
//		System.out.println(value);
		js.executeScript("arguments[0].value='Marinal Mishra'",value);
		
	}

}
