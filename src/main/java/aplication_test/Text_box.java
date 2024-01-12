package aplication_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text_box {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mrinal Kumar");
		driver.findElement(By.id("email")).sendKeys("Mrinalmishra@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("8787635464");
		driver.findElement(By.id("textarea")).sendKeys("Patna bitha ");
		driver.close();
		
	}

}
