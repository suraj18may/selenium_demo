package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlterWithOkAndCancal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
//		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
				
	}

}
