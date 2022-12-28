package com.accounts.data;

import java.time.LocalDate;
import java.util.ArrayList;

import com.accounts.exception.AccountAlreadyActiveException;
import com.accounts.exception.AccountAlreadyClosedException;
import com.accounts.exception.AgeValidityException;
import com.accounts.exception.InsufficientBalanceException;
import com.accounts.exception.InvalidPrivilegeException;
import com.accounts.exception.LimitExceedsExceptions;
import com.accounts.exception.RegistrationNumberisNullException;
import com.accounts.exception.WrongPinNumberException;

public abstract class Account {
private String accountNumber;
private String name;
private int pinNumber;

private LocalDate activatedDate;
private LocalDate closedDate;


public LocalDate getActivatedDate() {
	return activatedDate;
}
public void setActivatedDate(LocalDate activatedDate) {
	this.activatedDate = activatedDate;
}
public LocalDate getClosedDate() {
	return closedDate;
}
public void setClosedDate(LocalDate closedDate) {
	this.closedDate = closedDate;
}
private Privilege privilege;
private double balance;
private boolean isActive;
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPinNumber() {
	return pinNumber;
}
public void setPinNumber(int pinNumber) {
	this.pinNumber = pinNumber;
}
public Privilege getPrivilege() {
	return privilege;
}
public void setPrivilege(Privilege privilege) {
	this.privilege = privilege;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
public abstract boolean open() throws AccountAlreadyActiveException, AgeValidityException, RegistrationNumberisNullException;
public boolean closeAccount() throws AccountAlreadyClosedException
{
	boolean isClosed=false;
	if(!this.isActive())
		throw new AccountAlreadyClosedException("account is already closed");
	this.setActive(false);
	this.setClosedDate(LocalDate.now());
	isClosed=true;
	return isClosed;
}
public boolean withdraw(double amount,int pinNumber)throws AccountAlreadyClosedException, WrongPinNumberException, InsufficientBalanceException
{
	boolean isWithdrawn=false;
	if(!this.isActive())
		throw new AccountAlreadyClosedException("account is already closed");
	if(this.getPinNumber()!=pinNumber)
		throw new WrongPinNumberException("enter correct pin number");
    if(this.getBalance()<amount)
    	throw new InsufficientBalanceException("insufficient balance");
    double balance=this.getBalance()-amount;
    this.setBalance(balance);
    isWithdrawn=true;
	return isWithdrawn;
}
public boolean deposit(double amount) throws AccountAlreadyClosedException
{
	boolean isDeposit=false;
	if(!this.isActive())
		throw new AccountAlreadyClosedException("account is already closed");
	double balance=this.getBalance();
	this.setBalance(balance+amount);
	isDeposit=true;
	return isDeposit;
}

public boolean transfer(Transfer transfer) throws AccountAlreadyClosedException, InsufficientBalanceException, InvalidPrivilegeException, WrongPinNumberException, LimitExceedsExceptions
{
	boolean isTransfer=false;
	double privilegeLimit = LogManager.getPrivilegeLimit(transfer.getFromAccount().getPrivilege());
	if(!transfer.getFromAccount().isActive())
		throw new AccountAlreadyClosedException("senders account is closed");
	if(!transfer.getToAccount().isActive())
		throw new AccountAlreadyClosedException("receivers account is closed");
	
	if(transfer.getFromAccount().getBalance() < transfer.getAmount())
		throw new InsufficientBalanceException("Sender's Account Balance is Insufficient");
	
	if(transfer.getFromAccount().getPinNumber() != pinNumber)
		throw new WrongPinNumberException("Wrong PIN Number!!!!!!!");
	
	ArrayList<Log> logBook = LogManager.getLogBook();
	Log log ;
	double userTransaction = 0.0;
	if(transfer.getAmount()>=privilegeLimit)
		throw new LimitExceedsExceptions("Transcation Limit Exceeded!!!");
	if(logBook.isEmpty() && transfer.getAmount() <= privilegeLimit) {
		log = new Log();
		log.setAccountNumber(transfer.getFromAccount().getAccountNumber());
		log.setDate(LocalDate.now());
		log.setMode(transfer.getTransferMode());
		log.setTransactionAmount(transfer.getAmount());

		logBook.add(log);
		transfer.getFromAccount().setBalance(transfer.getFromAccount().getBalance() - transfer.getAmount());
		transfer.getToAccount().setBalance(transfer.getToAccount().getBalance() + transfer.getAmount());
		isTransfer = true;

	}
	
	else {
		
		//double userTransaction = 0.0;
		for (Log log1 : logBook) {
			
			if(log1.getAccountNumber() == transfer.getFromAccount().getAccountNumber()) {
				userTransaction = userTransaction + log1.getTransactionAmount();
				
			}
		}
		
		if(userTransaction+transfer.getAmount() >= privilegeLimit  ) {
			throw new LimitExceedsExceptions("Transcation Limit Exceeded!!!");
		}
		
		
		log = null; 
		log = new Log();
		log.setAccountNumber(transfer.getFromAccount().getAccountNumber());
		log.setDate(LocalDate.now());
		log.setMode(transfer.getTransferMode());
		log.setTransactionAmount(transfer.getAmount());
		logBook.add(log);
		
		transfer.getFromAccount().setBalance(transfer.getFromAccount().getBalance() - transfer.getAmount());
		transfer.getToAccount().setBalance(transfer.getToAccount().getBalance() + transfer.getAmount());
		isTransfer = true;
		
		
	}
	
	
	LogManager.setLogBook(logBook);
	
	return isTransfer;
	
}



}