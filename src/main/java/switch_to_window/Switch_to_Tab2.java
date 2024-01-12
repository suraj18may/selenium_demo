package switch_to_window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_to_Tab2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.amazon.in/");
		

	}

}
