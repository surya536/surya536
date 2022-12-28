package com.accounts.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.accounts.exception.InvalidPrivilegeException;

public class LogManager {
private static Map<Privilege,Double> privileges=new HashMap<Privilege,Double>();
private static ArrayList<Log>  logBook=new ArrayList<>();

static {
	privileges.put(Privilege.PREMIUM, 100000.00);
	privileges.put(Privilege.GOLD, 50000.00);
	privileges.put(Privilege.SILVER, 25000.00);
}

public static double getPrivilegeLimit(Privilege privilege) throws InvalidPrivilegeException
{
	double limit=0.0;
	if(privileges.containsKey(privilege))
		limit=privileges.get(privilege);
	else
		throw new InvalidPrivilegeException("invalid privilege");
	return limit;

}
public static ArrayList <Log> getLogBook() {
	return logBook;
}
public static void setLogBook(ArrayList<Log> logBook) {
	LogManager.logBook = logBook;
}
}
