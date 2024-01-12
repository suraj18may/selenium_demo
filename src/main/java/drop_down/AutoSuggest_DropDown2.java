package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggest_DropDown2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("H");
		
		Thread.sleep(5000);
		
		List<WebElement> ele=driver.findElements(By.xpath("//ul//li[@role='treeitem']"));
		System.out.println(ele.size());
//		
		for(WebElement elements:ele)
		{
			elements.getText();
			if(elements.getText().contains("Hong"))
			{
			 elements.click();
			 break;
			}
			
			
		}
		
		
		
	}

}
