package switch_to_window;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_to_Tab {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).sendKeys(tab);
		
		
		

	}

}
