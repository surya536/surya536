package com.accounts.data;


import java.time.LocalDate;

public class Log {
	private String accountNumber;
	private LocalDate date;
	private TransferMode mode;
	private Double transactionAmount;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	@Override
	public String toString() {
		return "\n AccountNumber=" + accountNumber + ", Date of Transaction =" + date + ", Mode=" + mode + ", TransactionAmount="
				+ transactionAmount + "";
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public LocalDate getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	/**
	 * @return the mode
	 */
	public TransferMode getMode() {
		return mode;
	}
	/**
	 * @param mode the mode to set
	 */
	public void setMode(TransferMode mode) {
		this.mode = mode;
	}
	/**
	 * @return the transactionAmount
	 */
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	/**
	 * @param transactionAmount the transactionAmount to set
	 */
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
}


