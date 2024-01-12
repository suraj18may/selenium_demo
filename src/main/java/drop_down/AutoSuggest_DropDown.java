package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggest_DropDown {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hdfc");
		List<WebElement> ele=driver.findElements(By.xpath("//ul//li[@class='sbct']"));
		System.out.println(ele.size());
		
		for(WebElement elements:ele)
		{
			elements.getText();
			if(elements.getText().contains("number"))
			{
			 elements.click();
			 break;
			}
			
			
		}
		
		
		
	}

}
