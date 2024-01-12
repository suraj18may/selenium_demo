package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetValueInToolTip {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(0);
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"age\"]"));
		System.out.println(logo.getAttribute("title"));
	}
}
