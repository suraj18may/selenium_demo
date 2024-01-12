package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLinks {
	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		driver.findElement(By.linkText("Best Sellers")).click();
//		driver.findElement(By.partialLinkText("Best Sel")).click();
		
		
		
//		capture all links by for loop
//		
//		List<WebElement> allele=driver.findElements(By.tagName("a"));
//		
//		
//		for(int i=0;i<=allele.size();i++)
//		{
//			System.out.println(allele.get(i).getText());
//			System.out.println(allele.get(i).getAttribute("href"));
//		}
//		
		
//		capture all links by for each loop
//		
		List<WebElement> allele=driver.findElements(By.tagName("a"));
		
		
		for(WebElement elements:allele)
		{
			System.out.println(elements.getText());
			System.out.println(elements.getAttribute("href"));
		}
		driver.quit();
//		
 }
	
}