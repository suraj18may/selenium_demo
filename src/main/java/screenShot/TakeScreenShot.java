package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
//		all page
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File trg=new File(".\\ScreenShot\\homepage2.png");
//		FileUtils.copyFile(src, trg);
//		Thread.sleep(2000);
//			driver.close();
		
//		Specific Section
//		WebElement ele=driver.findElement(By.xpath("//*[@id=\"header-inner\"]"));
//		File src=ele.getScreenshotAs(OutputType.FILE);
//		File trg=new File(".\\ScreenShot\\logo.png");
//		FileUtils.copyFile(src, trg);
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"HTML8\"]"));
		File src=ele.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\ScreenShot\\pagination.png");
		FileUtils.copyFile(src, trg);
		
		
		
		Thread.sleep(2000);
			driver.close();
	}

}
