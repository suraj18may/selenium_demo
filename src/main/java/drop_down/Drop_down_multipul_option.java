package drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_down_multipul_option {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement element=driver.findElement(By.id("Skills"));
		
		Select select =new Select(element);
		Thread.sleep(5000);
		List<WebElement> opt=select.getOptions();
		
		for(WebElement option:opt)
		{
			System.out.println(option.getText());
			if(option.getText().equals("APIs"))
			{
				option.click();
				break;
			}
		}
		
	}

		
	}


