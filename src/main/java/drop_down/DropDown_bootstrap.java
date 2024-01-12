package drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_bootstrap {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.xpath("//*[@id=\"select2-billing_country-container\"]")).click();
		
		List<WebElement> allcountry=driver.findElements(By.xpath("//*[@id=\"select2-billing_country-results\"]//li"));
		System.out.println(allcountry.size());
		
		for(WebElement countrys:allcountry) 
		{
			countrys.getText();
			System.out.println(countrys.getText());
			if(countrys.getText().equals("India"))
			{
				countrys.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\"select2-billing_state-container\"]")).click();
		
		List<WebElement> allstate=driver.findElements(By.xpath("//*[@id=\"select2-billing_state-results\"]//li"));
		System.out.println(allstate.size());
		
		for(WebElement states:allstate) 
		{
			states.getText();
			System.out.println(states.getText());
			if(states.getText().equals("Goa"))
			{
				states.click();
				break;
			}
		}
		
		
		
	}

}
