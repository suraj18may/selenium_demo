package links;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handel_Broken_links {
	
	public static void main(String[] args) throws MalformedURLException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> allele=driver.findElements(By.tagName("a"));
		int brokenslinks=0;
		
		for(WebElement elements:allele)
		{
			String Url=elements.getAttribute("href");
			
			if(Url==null || Url.isEmpty())
			{
				System.out.println("Url is Empty");
				continue;
			}
			
			URL links=new URL(Url);
			
			try
			{
				HttpURLConnection httpconn=(HttpURLConnection) links.openConnection();
				httpconn.connect();
				if(httpconn.getResponseCode()>400)
				{
					System.out.println(httpconn.getResponseCode()+"is" +   "   is broken link");
					brokenslinks++;
				}
				else
				{
					System.out.println(httpconn.getResponseCode()+"is" +   "   is valid link");
				}
			}
			catch(Exception e)
			{
				
			}
		}
		
		System.out.println(brokenslinks);
		driver.quit();
		
		
		
 }
	
}