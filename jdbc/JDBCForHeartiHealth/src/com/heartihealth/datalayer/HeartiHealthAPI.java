package com.heartihealth.datalayer;

import java.sql.SQLException;

public interface HeartiHealthAPI {

	public boolean deleteBloodTestRecord(String memberID) throws SQLException;
	
}
