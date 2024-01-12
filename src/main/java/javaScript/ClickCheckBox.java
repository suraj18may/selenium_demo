package javaScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickCheckBox {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		//		click checkbox
		//		WebElement ele=driver.findElement(By.xpath("//*[@id=\"sunday\"]"));
		//		JavascriptExecutor js=(JavascriptExecutor) driver;
		//		js.executeScript("arguments[0].click()",ele);

		//		click all check box
		//		List<WebElement> cheakboxs=driver.findElements(By.xpath("//*[@type='checkbox' and contains(@value,'day')]"));
		//		
		//		for(WebElement boxs:cheakboxs) {
		//		JavascriptExecutor js=(JavascriptExecutor) driver;
		//		js.executeScript("arguments[0].click()",boxs);


	

		

	}

}
