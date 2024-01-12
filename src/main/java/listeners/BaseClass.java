package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static String ScreeShotFolder;
	@BeforeTest
	public void setup(){
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}


	@AfterTest
	public void teardown(){
		driver.quit();
	}
	public void ScreenShot(String filename) {
		if(ScreeShotFolder == null) {
			LocalDateTime myDateObj = LocalDateTime.now();
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			ScreeShotFolder = myDateObj.format(myFormatObj);
		}

		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File  dt=new File("./ScreenShot2/"+ScreeShotFolder+"/"+filename);
		try {
			FileUtils.copyFile(src, dt);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Get Screenshot successfully");
	}


}
