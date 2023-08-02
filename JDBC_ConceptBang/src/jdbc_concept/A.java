package jdbc_concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class A {
public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name ");
		String name=sc.next();
		System.out.println("Enter the city ");
		String city=sc.next();
		System.out.println("Enter the Email Id ");
		String email=sc.next();
		System.out.println("Enter the Mobile No ");
		String mobile=sc.next();
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sampledb", "root", "3306");
		//System.out.println(con);
		
		//Run SQL queries
		Statement stm=con.createStatement();
		stm.executeUpdate
		("insert into register values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		//("Delete from register where email='amit@gmail.com'");
		//("Update register set mobile='9695096749' where email='amitgkp2111@gmail.com'");
		//close connection
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
