package Automation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_first {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraj\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver= new EdgeDriver();

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(10000);
	    driver.getCurrentUrl();
		driver.findElement(By.name("q")).sendKeys("sachin",Keys.ENTER);
	     
	}

}
