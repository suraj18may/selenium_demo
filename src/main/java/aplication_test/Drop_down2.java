package aplication_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_down2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		
		Select select =new Select(element);
		Thread.sleep(5000);
		select.selectByValue("usa");
		Thread.sleep(5000);
		select.selectByVisibleText("Canada");
		Thread.sleep(5000);
		select.selectByIndex(3);
		
		
	}

		
	}


