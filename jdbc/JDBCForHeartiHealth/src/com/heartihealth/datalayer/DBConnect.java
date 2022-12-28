package com.heartihealth.datalayer;
import java.io.Console;
import java.sql.*;

public class DBConnect {
	
	public static  Connection connect() 
	{
		Connection conn = null;
		try
		{

DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			 conn=DriverManager.getConnection("jdbc:mysql://localhost/heartihealth","root","mysql");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		return conn;

	}

}
