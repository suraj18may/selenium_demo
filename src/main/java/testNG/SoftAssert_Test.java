package testNG;

import static org.testng.Assert.*;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Test {
	@Test
	public void f1() {
		SoftAssert softAssert=new SoftAssert();
		int a=10;
		int b=10;
		softAssert.assertEquals(a,b,"is Equals");
		System.out.println("this line Execute");
		
		int x=10;
		int y=10;
		softAssert.assertNotEquals(x,y,"is not Equals");
		System.out.println("this line Execute");
		
		int p=15;
		int q=15;
		softAssert.assertEquals(p,q,"is Equals");
		System.out.println("this line Execute");
		
		softAssert.assertAll();
	}
	

}
