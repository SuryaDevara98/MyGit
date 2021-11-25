package com.cg.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstConnection 
{
	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bult20oct","root","Prasanna@98");
			Statement statement = conn.createStatement();
			ResultSet rest = statement.executeQuery("select * from userinfo");
			while(rest.next())
			
				System.out.println(rest.getString(1)+" "+rest.getString(2)+" "+rest.getString(3));
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}