package database_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) throws SQLException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/opencart/index.php?route=account/register");

		String fname="Mrinal";
		String lname="Mishra";
		String email="Mrinal@gmail.com";
		String phone="1234567891";
		String password="1234";
		String confirm="1234";


		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("telephone")).sendKeys(phone);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirm")).sendKeys(confirm);
		driver.findElement(By.name("agree")).click();
		//*[@id="content"]/form/div/div/input[2]
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();

		String text=driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();



		try
		{
			if(text.equalsIgnoreCase("Your Account Has Been Created!"))
			{
				System.out.println("Registration Successfull");
			}
			else
			{
				System.out.println("Registration not Successfull");
			}
		}
		catch(Exception e)
		{
			System.out.println("some problem in registration");
		} 

		//		database connection
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/opencartdemo","root","");
		Statement stmt=con.createStatement();
		String query="select firstname,lastname,email,telephone from oc_customer";
		ResultSet rs=stmt.executeQuery(query);

		boolean status=false;
		while(rs.next())
		{
			String firstname=rs.getString("firstname");
			String lastname=rs.getString("lastname");
			String emails=rs.getString("email");
			String telephone=rs.getString("telephone");

			if(fname.equals(firstname) && lname.equals(lastname) && emails.equals(emails) && phone.equals(telephone))
			{
				System.out.println("Record found  : Test pass");
				status=true;
				break;
			}

			if(status==false)
			{
				System.out.println("Recoard not foun : test fail");
			}

		}

	}
}