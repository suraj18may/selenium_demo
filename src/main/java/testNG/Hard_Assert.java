package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Hard_Assert {
     @Test
	public void f1() {
		
		int a=10;
		int b=10;
		assertEquals(a,b,"is Equals");
		System.out.println("this line Execute");
		
		int x=10;
		int y=12;
		assertEquals(x,y,"is not Equals");
		System.out.println("this line Execute");
		
		int p=15;
		int q=15;
		assertEquals(p,q,"is Equals");
		System.out.println("this line Execute");
		
		
		
		
		
	}
	

	

}
