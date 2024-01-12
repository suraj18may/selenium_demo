package aplication_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Browser {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getCurrentUrl());
		String actualTitle="Automation Testing Practice";
		String ExpectedTitle=driver.getTitle();
		System.out.println("Title of the Page:"+ExpectedTitle);
		
		if (actualTitle.equals(ExpectedTitle)==true) {
			System.out.println("Test is pass");
		}
		else {
			System.out.println("Test is fail");
		}
		
	   Thread.sleep(5000);
	   driver.close();
		
	}

}
