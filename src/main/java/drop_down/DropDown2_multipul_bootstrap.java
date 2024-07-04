package drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown2_multipul_bootstrap {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.xpath("//*[@id=\"select2-billing_country-container\"]")).click();
		List<WebElement> allcountry=driver.findElements(By.xpath("//*[@id=\"select2-billing_country-results\"]//li"));
		System.out.println(allcountry.size());
		userDefineMethod(allcountry,"India");
		
		driver.findElement(By.xpath("//*[@id=\"select2-billing_state-container\"]")).click();
		List<WebElement> allstate=driver.findElements(By.xpath("//*[@id=\"select2-billing_state-results\"]//li"));
		System.out.println(allstate.size());
		userDefineMethod(allstate,"Goa");
					
	}
	
	public static void userDefineMethod(List<WebElement> ele,String value) {
	for(WebElement element:ele) 
	{
		element.getText();
		System.out.println(element.getText());
		if(element.getText().equals(value))
		{
			element.click();
			break;
		}
	}
	}
}
