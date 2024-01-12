package aplication_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_box {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//	1	click single Check box....................
//		driver.findElement(By.id("sunday")).click();
		
//	2	click multipul Check box,,..................
//		List<WebElement> weeks=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'day') ]"));
//		
//		for(WebElement i:weeks) {
//			
//			String days=i.getAttribute("id");
//			if(days.equals("monday") || days.equals("friday"))
//				i.click();
		
//	3	click all Check box.............by each loop method..............
//	   	List<WebElement> weeks=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'day') ]"));
//		
//		for(WebElement i:weeks) 
//		{
//			
//		i.click();
//		}

		
		
//	4	click all Check box.............by for  loop method..............
//		List<WebElement> weeks=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'day') ]"));
//		
//		for(int i=0;i<weeks.size();i++) 
//		{
//			
//		   weeks.get(i).click();
//		}
			
		
//	5	click last 2 Check box.............by for  loop method..............
//		List<WebElement> weeks=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'day') ]"));
//			int totalcheckboox=weeks.size();
//		
//		for(int i=totalcheckboox-3;i<totalcheckboox;i++) 
//		{
//			
//		   weeks.get(i).click();
//		}
//			
		
//	6	click first 2 Check box.............by for  loop method..............
		List<WebElement> weeks=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'day') ]"));
			int totalcheckboox=weeks.size();
		
		for(int i=0;i<totalcheckboox;i++) 
		{
			if(i<2)
		   weeks.get(i).click();
		}
		
		
	}

}
