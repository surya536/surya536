package com.heartihealth.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HeartiHealthUpdates implements HeartiHealthAPI {
	

	
	DBConnect d=new DBConnect();
	Connection conn=DBConnect.connect();
	
	public boolean deleteBloodTestRecord(String memberID) throws SQLException
	{
		
		try {
		Statement s3=conn.createStatement();
		String query2="delete from bloodtest where blood_id='"+memberID+"' ";
		s3.executeUpdate(query2);
		
			return true;
		}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		
		return false;
		
		
	}
}
