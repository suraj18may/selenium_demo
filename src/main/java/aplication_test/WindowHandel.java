package aplication_test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WindowHandel {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		String windowhandel=driver.getWindowHandle();
		System.out.println(windowhandel);
		
		driver.findElement(By.xpath("//a[text()='orange HRM']")).click();
		String windowhandel1=driver.getWindowHandle();
		System.out.println(windowhandel1);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> windowhandel2=driver.getWindowHandles();
		System.out.println(windowhandel2);
		int windows=windowhandel2.size();
		System.out.println(windows);
		
//		Iterator<String> iterator=windowhandel2.iterator();
//		String pwindow=iterator.next();
//		String cwindow=iterator.next();
//		
//		
//		driver.switchTo().window(cwindow);
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
//		driver.switchTo().window(pwindow);
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
	
		for(String windows1:windowhandel2) {
			driver.switchTo().window(windows1);
			 String Title=driver.getTitle();
			System.out.println(Title);
			System.out.println(driver.getCurrentUrl());
			
			if(Title.equals("OrangeHRM") || Title.equals("") ){
				
				driver.close();
			}
			
		}
		
		
		
		
 }
	
	
}