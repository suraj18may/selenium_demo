package testNG;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Page {
	
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("browser Launch Successfully");
	}
	@Test
	public void openUrl() {
		System.out.println("open url Successfully");
	}
	@Test
	public void login() {
		System.out.println("login Successfully");
	}
	@Test
	public void testFunctionality() {
		System.out.println("test functonality Successfully");
	}
	@Test
	public void testFunctionality2() {
		System.out.println("test functonality2 Successfully");
	}
	
    @AfterTest
    public void logout() {
    	System.out.println("logout Successfully");
    }
}



