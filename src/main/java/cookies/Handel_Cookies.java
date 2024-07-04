package cookies;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handel_Cookies {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Set<Cookie> cookie=driver.manage().getCookies();
		System.out.println(cookie.size());
		
		
		for(Cookie cok:cookie) {
			System.out.println(cok.getName()+"  "+cok.getValue());
		}
		
		Cookie cobj=new Cookie("name","mycookie");
		
		driver.manage().addCookie(cobj);
		cookie=driver.manage().getCookies();
		System.out.println(cookie.size());
		for(Cookie cok:cookie) {
			System.out.println(cok.getName()+"  "+cok.getValue());
		}
		
		driver.manage().deleteCookieNamed("name");
		cookie=driver.manage().getCookies();
		System.out.println(cookie.size());
		
		
		driver.manage().deleteAllCookies();
		cookie=driver.manage().getCookies();
		System.out.println(cookie.size());		
		
		
	}
}
