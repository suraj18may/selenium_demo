package testNG;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;


public class Assertion {

	@Test
	public void f1() {
          int a=10;
          int b=10;
         assertEquals(a, b,"Not Equals");
         System.out.println("f1 method is  Execute");
    }
	@Test
	public void f2() {
		boolean a=true;
		boolean b=false;
		assertEquals(a,b,"boolean is not equals" );
		 System.out.println("this line is  Execute");
    }
	@Test
	public void f3() {
          int a=10;
          int b=10;
         assertEquals(a, b,"Not Equals");
         System.out.println("f2 method is  Execute");
    }
}
