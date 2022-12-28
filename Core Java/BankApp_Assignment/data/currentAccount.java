package com.accounts.data;

import java.time.LocalDate;

import com.accounts.exception.AccountAlreadyActiveException;
import com.accounts.exception.AgeValidityException;
import com.accounts.exception.RegistrationNumberisNullException;


public class currentAccount extends Account {
	private String companyName;
	private String website;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	private String registrationNumber;
	@Override
	public boolean open() throws AccountAlreadyActiveException,RegistrationNumberisNullException {
		// TODO Auto-generated method stub
		if(this.isActive())
			throw new AccountAlreadyActiveException("account is already active");
		
		boolean isOpened=false;
		boolean isValid=false;
		try {
			isValid=checkRegistrationNum(getRegistrationNumber());
			isOpened=activateAccount(isValid);
		}
		catch(RegistrationNumberisNullException e)
		{
			System.out.println("age is less than 18 years");
			e.printStackTrace();
		}
		
		return isOpened;
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
	public boolean checkRegistrationNum(String registrationNumber) throws RegistrationNumberisNullException
	{
		boolean isValid=false;
		if(registrationNumber==null)
		throw new RegistrationNumberisNullException("registration number is null");
	isValid=true;
	return isValid;
	}
	

}
