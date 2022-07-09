package org.sovan.insertApp;

import java.sql.*;

public class Test 
{
public static void main(String[] args) 
{
	   Connection con=null;
	   Statement stmt=null;
	   String qry="insert into btm.student values (1,'Sovan',65.05)";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Class loaded SucessFull");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
		System.out.println("Connection Establish With The database Server");
		stmt=con.createStatement();
		System.out.println("Platform Update");
		stmt.executeUpdate(qry);
		System.out.println("Data Inserseted");
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
	finally {
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Closed All costly Resource");
	}
}
}
