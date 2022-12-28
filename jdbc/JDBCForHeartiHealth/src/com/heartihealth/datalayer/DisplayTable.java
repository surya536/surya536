package com.heartihealth.datalayer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayTable {
	DBConnect d=new DBConnect();
	Connection conn=DBConnect.connect();
	ResultSet rs;
	Statement s;
	String q;
	public static void displayResults(ResultSet rs) throws SQLException
	{
		//TODO
	}
	
	
	public void viewNoOfCasesByState()
	{
		try {
			s=conn.createStatement();
			q="select addr.state,count(*) NoOfAttacks from addressinfo addr join cardiodiagnosis car on car.memberinfo_member_id=addr.memberinfo_member_id "
					+ "where car.cardioarrestdetected=1 group by addr.state order by count(*) desc";
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}



