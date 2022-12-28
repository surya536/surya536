package com.heartihealth.datalayer;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
    	
    	System.out.println(DBConnect.connect());
        
        MemberAPI mp=new MemberUpdates(); 
        	 boolean status=mp.addMember("304","robwil", "Robbie", "Williams", 34, "Male", "robwil@gmail.com","9443433995"); 
        	 if(status)
        		  System.out.println("record added"); 
             else 
        	 System.out.println("fail");
        	
        	 boolean status1=mp.updateMemberEmail("304", "robbiewilliams@gmail.com");
        	 if(status1)
       		  System.out.println("record added"); 
            else 
       	     System.out.println("fail");
        	  HeartiHealthAPI h=new HeartiHealthUpdates();
        	
        	  boolean status2=  h.deleteBloodTestRecord("bl221");
        	if(status2)
        		System.out.println("record successfully deleted");
        	else
        		System.out.println("delete command failed");
        	
    	
    }
}
