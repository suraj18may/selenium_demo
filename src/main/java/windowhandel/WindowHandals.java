package windowhandel;


import java.util.Set; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.Keys; 
import org.openqa.selenium.Point; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager; 
public class WindowHandals
{
	public static void main(String[] args) throws Exception 
	{ 
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.opencart.com/index.php?route=cms/demo"); 
		driver.findElement(By.xpath("//*[@id=\"cms-demo\"]/div[2]/div/div[2]/div/a")).click();
		Thread.sleep(5000);
		String title = driver.getTitle(); System.out.println(title);

		String windows = driver.getWindowHandle(); 
		
		Set<String> windows1 = driver.getWindowHandles(); 
	    	  int tab=windows1.size();
		
		System.out.println(windows); 
		System.out.println(windows1); 
		System.out.println(tab);
		
		for (String window : windows1) 
		{ 
			driver.switchTo().window(window);
			String title1=driver.getTitle();
			System.out.println(title1);
			if(title1.equals("OpenCart - Demo"))
			{
				driver.close();
			}
		} 
	} 
}


