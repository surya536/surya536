package com.accounts;

import java.time.LocalDate;

import com.accounts.data.Account;
import com.accounts.data.LogManager;
import com.accounts.data.Privilege;
import com.accounts.data.SavingsAccount;
import com.accounts.data.Transfer;
import com.accounts.data.TransferMode;
import com.accounts.data.currentAccount;
import com.accounts.exception.AccountAlreadyActiveException;
import com.accounts.exception.AccountAlreadyClosedException;
import com.accounts.exception.AgeValidityException;
import com.accounts.exception.InsufficientBalanceException;
import com.accounts.exception.InvalidPrivilegeException;
import com.accounts.exception.LimitExceedsExceptions;
import com.accounts.exception.RegistrationNumberisNullException;
import com.accounts.exception.WrongPinNumberException;


public class TestMain  {
	public static void main(String[] args) throws InvalidPrivilegeException  {
		SavingsAccount s1=new SavingsAccount();
		SavingsAccount s2=new SavingsAccount();
		
		
		s1.setName("harika");
		s1.setGender("female");
		LocalDate dateOfBirth=LocalDate.of(2000, 7, 2);
		s1.setDateOfBirth(dateOfBirth);
		s1.setPhoneNumber("8500241469");
		s1.setAccountNumber("12345678");
		
		boolean isOpened=false;
		try {
			isOpened=s1.open();
		}
		catch(AccountAlreadyActiveException |AgeValidityException e) 
		{
			e.printStackTrace();
		}
		if(isOpened) {
			s1.setPinNumber(1234);
			s1.setBalance(250000);
			s1.setPrivilege(Privilege.PREMIUM);
		}
	s2.setName("krishna");
	s2.setGender("female");
	s2.setDateOfBirth(LocalDate.of(1999, 12, 9));
	s2.setPhoneNumber("8074879929");
	s2.setAccountNumber("1111111");
	isOpened=false;
	try {
		isOpened=s2.open();
	}
	catch(AccountAlreadyActiveException |AgeValidityException e) 
	{
		e.printStackTrace();
	}
	if(isOpened) {
		s2.setPinNumber(5689);
		s2.setBalance(50000);
		s2.setPrivilege(Privilege.PREMIUM);
	}
	System.out.println(s1.getBalance());
	System.out.println(s2.getBalance());
	
	
	Transfer t=new Transfer(s1,s2,150000,TransferMode.NEFT,1234);
	System.out.println("----Transaction : 1-------");
	try {
		boolean transferfund=s1.transfer(t);
		if(transferfund)
			System.out.println("Fund Is Transfered Successfully!!!!");
			System.out.println(s1.getBalance());
			System.out.println(s2.getBalance());
	} catch (AccountAlreadyClosedException | LimitExceedsExceptions | WrongPinNumberException |InsufficientBalanceException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	t=new Transfer(s1,s2,20001,TransferMode.NEFT,1234);
	System.out.println("----Transaction : 2-------");
	try {
		boolean transferfund=s1.transfer(t);
		if(transferfund)
			System.out.println("Fund Is Transfered Successfully!!!!");
			System.out.println(s1.getBalance());
			System.out.println(s2.getBalance());
	} catch (AccountAlreadyClosedException | LimitExceedsExceptions | WrongPinNumberException |InsufficientBalanceException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	t=new Transfer(s1,s2,80000,TransferMode.NEFT,1234);
	System.out.println("----Transaction : 3-------");
	try {
		boolean transferfund=s1.transfer(t);
		if(transferfund)
			System.out.println("Fund Is Transfered Successfully!!!!");
			System.out.println(s1.getBalance());
			System.out.println(s2.getBalance());
	} catch (AccountAlreadyClosedException | LimitExceedsExceptions | WrongPinNumberException |InsufficientBalanceException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	t=new Transfer(s1,s2,40000,TransferMode.NEFT,1234);
	System.out.println("----Transaction : 4-------");
	try {
		boolean transferfund=s1.transfer(t);
		if(transferfund)
			System.out.println("Fund Is Transfered Successfully!!!!");
			System.out.println(s1.getBalance());
			System.out.println(s2.getBalance());
	} catch (AccountAlreadyClosedException | LimitExceedsExceptions | WrongPinNumberException |InsufficientBalanceException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	t=new Transfer(s1,s2,20000,TransferMode.NEFT,1234);
	System.out.println("----Transaction : 5-------");
	try {
		boolean transferfund=s1.transfer(t);
		if(transferfund)
			System.out.println("Fund Is Transfered Successfully!!!!");
			System.out.println(s1.getBalance());
			System.out.println(s2.getBalance());
	} catch (AccountAlreadyClosedException | LimitExceedsExceptions | WrongPinNumberException |InsufficientBalanceException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	
	System.out.println(LogManager.getLogBook());
	
	}
}
