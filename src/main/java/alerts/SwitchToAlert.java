package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToAlert {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		driver.switchTo().alert().accept();
	    
				
	}

}
