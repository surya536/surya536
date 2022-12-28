package com.heartihealth.datalayer;

import java.sql.SQLException;

public interface MemberAPI {

	public boolean addMember(String id,String userName,String firstName,String lastName,int age,String Gender,String email,String phoneNo) throws SQLException;
	public boolean updateMemberEmail(String memberID,String newEmailID) throws SQLException;
}
