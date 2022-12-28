package com.accounts.data;

import java.time.LocalDate;

import com.accounts.exception.AccountAlreadyActiveException;
import com.accounts.exception.AgeValidityException;
import com.accounts.exception.InsufficientBalanceException;

public class SavingsAccount extends Account {
private LocalDate dateOfBirth;
private String Gender;
private String phoneNumber;
public LocalDate getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
@Override
public boolean open() throws AccountAlreadyActiveException,AgeValidityException {
	// TODO Auto-generated method stub
	if(this.isActive())
		throw new AccountAlreadyActiveException("account is already active");
	
	boolean isOpened=false;
	boolean isValid=false;
	try {
		isValid=checkAgeValidity(getDateOfBirth());
		isOpened=activateAccount(isValid);
	}
	catch(AgeValidityException e)
	{
		System.out.println("age is less than 18 years");
		e.printStackTrace();
	}
	
	return isOpened;
}

public boolean withdraw(double amount) throws AccountAlreadyActiveException, InsufficientBalanceException
{	
	if(this.isActive())
	throw new AccountAlreadyActiveException("account is already active");
    if(this.checkBalance(getBalance()));
    deduct(amount);
	
	return false;
	
}

public double deduct(double amount) {
 double m;
 m=this.getBalance()-amount;
 return m;
 
}

public boolean activateAccount(boolean isvalid) {
	boolean isActivated=false;
	if(isvalid)
	{
		this.setActive(isvalid);
		this.setActivatedDate(LocalDate.now());
		isActivated=true;
	
}
	return isActivated;
}


public boolean checkBalance(double balance) throws InsufficientBalanceException
{
	boolean flag=false;
	if(balance<500)
		throw new InsufficientBalanceException("insufficient balance");
	flag=true;
	return flag;
}


public boolean checkAgeValidity(LocalDate dateOfBirth) throws AgeValidityException
{
	boolean isValid=false;
	if(LocalDate.now().getYear()-dateOfBirth.getYear()<18)
		throw new AgeValidityException("Age is less than 18 years");
	isValid=true;
	return isValid;
}


}


