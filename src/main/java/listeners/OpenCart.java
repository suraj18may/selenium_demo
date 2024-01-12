package listeners;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class OpenCart {

	@Listeners(ListenerClass.class)
	public class LoginTest  extends BaseClass {
		@Test
		public  void  OpenCartLogin() throws InterruptedException {
		
			driver.get("https://demo.opencart.com/admin/");

			driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys("Admin1");
			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("1234");
			driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
			Thread.sleep(2000);
			assertTrue(false);
		}	
}
}