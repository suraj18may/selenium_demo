package DatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date {

	public static void main(String[] args) {
	 WebDriverManager.edgedriver().setup();
	 WebDriver driver= new EdgeDriver();
	 driver.get("https://demo.automationtesting.in/Datepicker.html");
	 driver.manage().window().maximize();
	 
	 String month="December";
	 String yr="2026";
	 String date="28";
	 
	 driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
	 
	 while(true) 
	 {
	  String monthyear=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
	  String arr[]=monthyear.split(" ");
	  String mon=arr[0];
	  String year=arr[1];
	  
	  if(mon.equals(month) && year.equals(yr)) {
		  break;
	  }
	  else
		  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click(); 
	 }
	 
	 List<WebElement> dates=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//td/a"));
	 
	 for(WebElement alldates:dates) 
	 {
		 String text=alldates.getText();
		 if(text.equals(date)) 
		 {
			 alldates.click();
			 break;
		 }
		 }
	}

}
