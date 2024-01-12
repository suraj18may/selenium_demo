package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggest_DropDown3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
		WebElement searchbox=driver.findElement(By.xpath("//input[@placeholder='From']"));
		searchbox.sendKeys("p");
		Thread.sleep(5000);
		String text;
		
		do 
		{
			searchbox.sendKeys(Keys.ARROW_DOWN);
			text=searchbox.getAttribute("value");
			if(text.contains("Orly"))
			{
				searchbox.sendKeys(Keys.ENTER);
				break;
			}
			
		}while(!text.isEmpty());
			
		
//		List<WebElement> ele=driver.findElements(By.xpath("//ul//li//div[starts-with(@class,'make')]"));
//		System.out.println(ele.size());
//		
//		for(WebElement elements:ele)
//		{
//			elements.getText();
//			if(elements.getText().contains("Pune"))
//			{
//			 elements.click();
//			 break;
//			}
//			
//			
//		}
		
		
		
	}

}
