package windowhandel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.sun.jdi.Method;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindowHandel {
	
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
		
//	Method...1
//	   Iterator<String> it=windowhandels.iterator();
//	   
//	   String parentwindow=it.next();
//	   String childwindow=it.next();
//	   
//	   System.out.println("parent window :"+parentwindow);
//	   System.out.println("child window :"+childwindow);
//	   
//	   driver.switchTo().window(parentwindow);
//	   
//	   System.out.println(driver.getTitle());
//	   
//	   driver.switchTo().window(childwindow);
//	   driver.close();
	   
//		Method...2   
	   List<String> windowsid=new ArrayList(windowhandels);
			   
			   String parentwindow =windowsid.get(0);
	           String childwindow =windowsid.get(1);
	   
	           System.out.println("parent window :"+parentwindow);
	    	   System.out.println("child window :"+childwindow);
	    	   
	    	   driver.switchTo().window(parentwindow);
	    	   
	    	   System.out.println(driver.getTitle());
	    	   
	    	   driver.switchTo().window(childwindow);
	    	   driver.close();
		
	}

}
