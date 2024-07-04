package aplication_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Page {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https:Facebook.com");
		driver.findElement(By.id("email")).sendKeys("rohit");
		driver.findElement(By.id("pass")).sendKeys("123");
//		u_0_5_kz
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
