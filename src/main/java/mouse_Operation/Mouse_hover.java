package mouse_Operation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_hover {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		Actions action=new Actions(driver);
		
		WebElement E1=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"));
		action.moveToElement(E1).click().build().perform();
		
		WebElement E2=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]"));
		action.moveToElement(E2).click().build().perform();
		
		WebElement E3=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
		action.moveToElement(E3).click().build().perform();
		
	}

}
