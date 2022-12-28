package com.accounts.data;

public class Transfer {
private Account fromAccount;
private Account toAccount;
private double amount;
private TransferMode transferMode;
private int pinNumber;
public Transfer(Account fromAccount, Account toAccount, double ammount, TransferMode transferMode, int pinNumber) {
	super();
	this.fromAccount = fromAccount;
	this.toAccount = toAccount;
	this.amount = ammount;
	this.transferMode = transferMode;
	this.pinNumber = pinNumber;
}
public Account getFromAccount() {
	return fromAccount;
}
public void setFromAccount(Account fromAccount) {
	this.fromAccount = fromAccount;
}
public Account getToAccount() {
	return toAccount;
}
public void setToAccount(Account toAccount) {
	this.toAccount = toAccount;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public TransferMode getTransferMode() {
	return transferMode;
}
public void setTransferMode(TransferMode transferMode) {
	this.transferMode = transferMode;
}
public int getPinNumber() {
	return pinNumber;
}
public void setPinNumber(int pinNumber) {
	this.pinNumber = pinNumber;
}

}
