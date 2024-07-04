package web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagenation {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
	    int element=driver.findElements(By.xpath("//li//a")).size();
	    System.out.println(element);
	    
	    for(int p=1;p<=element;p++)
	    {
	    	WebElement active_page=driver.findElement(By.xpath("//a[@class='active']"));
	    	System.out.println("active page" +active_page.getText());
	    	active_page.click();
	    	
	    	int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
	    	System.out.println("number of rows" +rows);
	    	
	    	int columns=driver.findElements(By.xpath("//table[@id='productTable']//thead//tr//th")).size();
	    	System.out.println("number of columns" +columns);
	    	
	    	for (int r=1;r<=rows;r++)
	    	{
	    		for(int c=1;c<=columns;c++)
	    		{
	    			String  data=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td["+c+"]")).getText();
	    			System.out.print(data+"  ");
	    		}
	    		System.out.println();
	    	}

	    	
	    	String pageno=Integer.toString(p+1);
	    	driver.findElement(By.xpath("//ul[@id='pagination']//li//a[text()='"+pageno+"']")).click();
	    	
	    }
		
		
	}

}
