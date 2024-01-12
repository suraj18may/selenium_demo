package web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		System.out.println(rows.size());
//		read data based on condition
		for(int i=2;i<=rows.size();i++) {
	
			
				String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
				
				if(authorName.equals("Mukesh")) {
					String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
					String Subject=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[3]")).getText();
					System.out.println(bookName+" "+authorName+" "+Subject);
				}
				
		}	
	}

}
