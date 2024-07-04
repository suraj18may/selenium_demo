package waiting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserDefineExplicitWait {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		By element=By.xpath("//input[@name='username']");
		userDefinewait(driver,element,5).sendKeys("Admin");
		
		By element1=By.xpath("//input[@type='password']");
		userDefinewait(driver,element1,5).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
	
	}
	
	
	public static WebElement userDefinewait(WebDriver driver, By locater,int times) {
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(times));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(locater));
		
		return driver.findElement(locater);
	}
	

}
