package database_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
	public static void main(String[] args) throws SQLException {


		//		database connection
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		Statement stmt=con.createStatement();
		String query="delete from student1  limit 3";
		stmt.execute(query);

	}

}
