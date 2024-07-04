package windowhandel;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindowHandel2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click(); 
	    Thread.sleep(5000);
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		Set<String> windowhandels=driver.getWindowHandles();
		System.out.println(windowhandels);
		System.out.println(windowhandels.size());
		
		
//		Iterator<String> it=windowhandels.iterator();
//		ArrayList<String>   winid=new ArrayList(windowhandels);
		

		for(String windows:windowhandels) {
			driver.switchTo().window(windows);
			String title=driver.getTitle();
			System.out.println(title);
			
			if(title.equals("OrangeHRM HR Software | OrangeHRM"))
			{
				driver.close();
			}
		}

	}

}
