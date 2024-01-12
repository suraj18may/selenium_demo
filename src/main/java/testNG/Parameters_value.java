package testNG;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_value {

	@Parameters("fname")	
	@Test
	public void parameter(String fname) {
		System.out.println(fname);
	}
	@Parameters("lname")
	@Test
	public void parameter2(String lname) {
		System.out.println(lname);
	}

	@Parameters({"fname","lname"})
	@Test
	public void parameter3(String fname ,String lname) {
		System.out.println("My Name is "+fname+" " +lname);
}
}