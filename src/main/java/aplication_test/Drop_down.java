package aplication_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_down {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement element=driver.findElement(By.id("Skills"));
		userDefineMethod(element,"APIs");
		WebElement year=driver.findElement(By.xpath("//*[@id=\'yearbox\']"));
		userDefineMethod(year,"1994");
		WebElement month=driver.findElement(By.xpath("(//select[@placeholder='Month'])[1]"));
		userDefineMethod(month,"May");
		WebElement day=driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
		userDefineMethod(day,"18");
		
	}

	public static void userDefineMethod(WebElement ele,String value) {
	
	Select select =new Select(ele);
	List<WebElement> opt=select.getOptions();
	
	for(WebElement option:opt)
	{
		if(option.getText().equals(value))
		{
			option.click();
			break;
		}
	}
		
	}


}