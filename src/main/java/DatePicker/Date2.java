package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date2 {
static String Date="12/28/2023";
	public static void main(String[] args) {
	 WebDriverManager.edgedriver().setup();
	 WebDriver driver= new EdgeDriver();
	 driver.get("https://demo.automationtesting.in/Datepicker.html");
	 driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).sendKeys(Date,Keys.ENTER);
	
	 

	}

}
