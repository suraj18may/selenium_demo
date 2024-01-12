package web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable3 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		List<WebElement> columns=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
		
		System.out.println(rows.size());
		System.out.println(columns.size());
		
//		read specific row and column
		
		String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.print(data);

		
	}

}
