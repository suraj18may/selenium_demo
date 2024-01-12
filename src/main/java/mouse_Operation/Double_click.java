package mouse_Operation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_click {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement E1=driver.findElement(By.xpath("//*[@id=\"field1\"]"));
		E1.clear();
		E1.sendKeys("Hello Mrinal");
		WebElement E2=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		Actions action=new Actions(driver);
		action.doubleClick(E2).build().perform();
	}
}
