package web_table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_WebTable {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		List<WebElement> columns=driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//th"));
		
		System.out.println(rows.size());
		System.out.println(columns.size());
		
//		method --------1 for loop
		for(int i=1;i<=rows.size();i++){
			for(int j=1;j<=columns.size();j++) {
				String data=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(data+ "   ");
			}
			System.out.println();
			
		}
		driver.quit();
				
	}

}


