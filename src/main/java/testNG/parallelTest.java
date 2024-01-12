package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelTest {public class ParallelTest {

WebDriver driver;

@Test(priority = 1)
public void testFirefox() throws InterruptedException {
System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
driver.get("https://www.bstackdemo.com/");
driver.manage().window().maximize();
Assert.assertEquals(driver.getTitle(), "StackDemo");
}

@Test(priority = 2)
public void testFirefox1() throws InterruptedException {
System.out.println("The thread ID for Firefox1 is "+ Thread.currentThread().getId());
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
driver.get("https://www.bstackdemo.com/");
driver.manage().window().maximize();
Assert.assertEquals(driver.getTitle(), "StackDemo"); 
}

@AfterClass
public void close() {
driver.quit();
} 
}

}
