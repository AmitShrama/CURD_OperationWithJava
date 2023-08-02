package jdbc_concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
  public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Delete the Record from Email enter ");
		String email=sc.next();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","3306");
		
		Statement stm=con.createStatement();
		stm.executeUpdate("delete from register where email='"+email+"'");
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
