package jdbc_concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","3306");
			Statement stm=con.createStatement();
			ResultSet result=stm.executeQuery("select * from register");
			
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
