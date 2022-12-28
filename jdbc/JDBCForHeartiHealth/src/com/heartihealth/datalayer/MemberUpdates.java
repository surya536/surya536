 	package com.heartihealth.datalayer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberUpdates implements MemberAPI {
	DBConnect d=new DBConnect();
	Connection conn=DBConnect.connect();

	@Override
	public boolean addMember(String id, String userName, String firstName, String lastName, int age, String Gender,
			String email, long phoneNo) throws SQLException 
	{
		try {
			Statement s=conn.createStatement();
			String query="insert into memberinfo values('"+id+"','"+userName+"','"+firstName+"','"+lastName+"','"+age+"','"+Gender+"','"+email+"','"+phoneNo+"')";
		s.executeUpdate(query);
		return true;
		
		} catch (SQLException e) {
	
			e.printStackTrace();
	
		return false;
	}
	}
	@Override
	public boolean updateMemberEmail(String memberID, String newEmailID) throws SQLException {
		// TODO Auto-generated method stub
		try
		{
			Statement s1=conn.createStatement();
			String query1="update memberinfo set email='"+newEmailID+"' where member_id='"+memberID+"' ";
			s1.executeUpdate(query1);
			return true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		

		return false;
	}
		
		
	}	
	

