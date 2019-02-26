package com.capgemini.Service;

import java.math.BigDecimal;

import com.capgemini.beans.Customer;
import com.capgemini.exceptions.DuplicatePhoneNumberException;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.PhoneNumberDoesNotExistException;

public interface WalletService {
		 public Customer createAccount(String name, String phonenumber,BigDecimal amount)throws DuplicatePhoneNumberException,PhoneNumberDoesNotExistException;
		public Customer showBalance(String phonenuber)throws PhoneNumberDoesNotExistException;
		public Customer Deposit(String phonenumber,BigDecimal amount)throws PhoneNumberDoesNotExistException,InsufficientBalanceException;
		public Customer Withdraw(String phoneNumber,BigDecimal amount)throws InsufficientBalanceException;
	    public Customer fundTransfer(String sourcephonenumber,String targetphonenumber,BigDecimal amount)throws InsufficientBalanceException,PhoneNumberDoesNotExistException;
	     public boolean validate(Customer c)throws PhoneNumberDoesNotExistException;
	}

	
	

