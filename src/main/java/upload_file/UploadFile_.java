package upload_file;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile_ {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]")).click();
		
//		use sendkeys
//		driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("C:\\Users\\suraj\\Desktop\\SurajKDas.pdf");
//		driver.findElement(By.xpath("//*[@id=\"pop_upload\"]")).click();
	
		
//		use robot class method
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		StringSelection ss=new StringSelection("C:\\Users\\suraj\\Desktop\\SurajKDas.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\"pop_upload\"]"));
		js.executeScript("arguments[0].click();", ele1);
	}

}
