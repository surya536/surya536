
	package com.accounts;

	import java.time.LocalDate;


	import com.accounts.data.SavingsAccount;
	import com.accounts.data.Transfer;
	import com.accounts.data.TransferMode;
	import com.accounts.data.currentAccount;
	import com.accounts.exception.AccountAlreadyActiveException;
	import com.accounts.exception.AccountAlreadyClosedException;
	import com.accounts.exception.AgeValidityException;
	import com.accounts.exception.InsufficientBalanceException;
	import com.accounts.exception.RegistrationNumberisNullException;
	import com.accounts.exception.WrongPinNumberException;


	public class Main {
		public static void main(String[] args)  {
			SavingsAccount s=new SavingsAccount();
			
			s.setName("harika");
			s.setGender("female");
			s.setAccountNumber("123");
			LocalDate dateOfBirth=LocalDate.of(2020, 7, 2);
			s.setDateOfBirth(dateOfBirth);
			s.setBalance(5000000.00);
			s.setPinNumber(1234);
			
			currentAccount c=new currentAccount();
			c.setName("harika");
			c.setRegistrationNumber("125834");
			c.setCompanyName("capgemini");
			c.setWebsite("harikadevineni@gmail.com");
			boolean isOpened=false;
			try {
				isOpened=s.open();
			}
			catch(AccountAlreadyActiveException |AgeValidityException e) 
			{
				e.printStackTrace();
			}
			if(isOpened)
				System.out.println("account is open");
		
		try {
			isOpened=c.open();
			c.checkRegistrationNum("1235");
		}
		catch(AccountAlreadyActiveException | RegistrationNumberisNullException e)
		{
			e.printStackTrace();
		}
		if(isOpened)
			System.out.println("account is open");
		//withdraw
		boolean isWithdrawn=false;
		try {
			isWithdrawn=s.withdraw(5000, 1234);
			
		}
		catch(WrongPinNumberException | InsufficientBalanceException | AccountAlreadyClosedException e)
				{
			e.printStackTrace();
				}

		if(isWithdrawn)
			System.out.println("yes! money is deducted");
		//deposit
		
	/*	boolean isDeposited=false;
		try {
			isDeposited=s.deposit(5000);
		}
		catch(AccountAlreadyClosedException e) {
			e.printStackTrace();
		}
		if(isDeposited)
			System.out.println("yes! amount is deposited");
		//transfer
		
		Transfer t=new Transfer(s,c,500,TransferMode.IMPS,1234);
		
		*/
		//close
		boolean isClosed=false;
		try {
			isClosed=s.closeAccount();
		}catch(AccountAlreadyClosedException e)
		{
			e.printStackTrace();
		}
		if(isClosed)
			System.out.println("savings account is closed");


	}
	}

