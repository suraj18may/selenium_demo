package location_and_Sizeo_of_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocationOfElement {
	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.amazon.in/");
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
		
//		method 1......loction of element
		System.out.println("location x,y"+logo.getLocation());
		System.out.println("location x"+logo.getLocation().getX());
		System.out.println("location y"+logo.getLocation().getY());
		
		
//		Method 2.....loction of element
		System.out.println("location x"+logo.getRect().getX());
		System.out.println("location y"+logo.getRect().getY());
		
//	   size of Element...method..1
		System.out.println("Size(hight,width)"+logo.getSize());
		System.out.println("Size(hight)"+logo.getRect().getHeight());
		System.out.println("Size(width)"+logo.getRect().getWidth());
		
//		size of Element...method..2
		System.out.println("Size(hight)"+logo.getRect().getDimension().getHeight());
		System.out.println("Size(width)"+logo.getRect().getDimension().getWidth());
		
		driver.close();
		
	}	

}
