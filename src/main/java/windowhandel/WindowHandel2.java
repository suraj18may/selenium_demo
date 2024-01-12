package windowhandel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindowHandel2 {
	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(
				By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click'] ")).click();
		Set<String> windowhandels=driver.getWindowHandles();
		System.out.println(windowhandels);
		System.out.println(windowhandels.size());
		
		for(String windows:windowhandels) {
		driver.switchTo().window(windows);
	     String Title=driver.getTitle();
	     String url=driver.getCurrentUrl();
	     System.out.println(url);

	     System.out.println(Title);
		if(Title.equals("Selenium"))
		{
			driver.close();
			
		}
		}
		
	}

}
