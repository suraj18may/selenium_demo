package download_folder;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Download_file {
	public static void main(String[] args) {
		
//		String location=System.getProperty("user.dir")+"\\download\\";
//		HashMap preferences=new HashMap();
//		preferences.put("download.default_directory",location);
//		
//		EdgeOptions option=new EdgeOptions();
//		option.setExperimentalOption("prefs",preferences);
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver=new EdgeDriver(option);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
//		driver.findElement(By.xpath("//*[@id=\"table-files\"]/tbody/tr[1]/td[5]/a")).click();
		
		
//		download pdf file
		String location=System.getProperty("user.dir")+"\\download\\";
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory",location);
		preferences.put( "plugins.always_open_pdf_externally", true);
		
		EdgeOptions option=new EdgeOptions();
		option.setExperimentalOption("prefs",preferences);
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
		driver.findElement(By.xpath("//*[@id=\"table-files\"]/tbody/tr[1]/td[5]/a")).click();
		
	}

}
