package aplication_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio_button {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement male=driver.findElement(By.id("male"));
		WebElement female=driver.findElement(By.id("female"));
		
		System.out.println("before Click");
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		System.out.println("after Click");
		male.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		female.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		driver.close();
		
		
	}

}
