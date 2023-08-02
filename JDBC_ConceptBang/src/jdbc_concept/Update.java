package jdbc_concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Update's Email ");
			String email=sc.next();
			System.out.println("Enter the Update your mobile no ");
			String mobile=sc.next();
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","3306");
			Statement stm=con.createStatement();
			stm.executeUpdate("Update register set mobile='"+mobile+"' where email='"+email+"'");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
