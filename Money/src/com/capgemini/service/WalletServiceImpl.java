package com.capgemini.service;

import java.math.BigDecimal;

import com.capgemini.beans.Customer;
import com.capgemini.exceptions.DuplicatePhoneNumberException;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.PhoneNumberDoesNotExistException;

public class WalletServiceImpl implements WalletService
{
	WalletRepo walletrepo;
	public WalletServiceImpl(WalletRepo walletrepo)
	{
		super();
		this.walletrepo=walletrepo;
	}

	@Override
	public Customer createAccount(String name, String phonenumber, BigDecimal amount)
			throws DuplicatePhoneNumberException, PhoneNumberDoesNotExistException {
		Wallet wallet=new Wallet(amount);
		Customer customer=new Customer(name,phonenumber,wallet);
		if(validate(customer))
			if(walletrepo.Save(customer))
				return customer;
		
		return null;
	}

	@Override
	public Customer showBalance(String phonenuber) throws PhoneNumberDoesNotExistException {
		Customer c1=walletrepo.findByPhoneNumber(phonenumber);
		return c1;
		return null;
	}

	@Override
	public Customer Deposit(String phonenumber, BigDecimal amount)
			throws PhoneNumberDoesNotExistException, InsufficientBalanceException {
	Customer customer=walletrepo.findByPhoneNumber(phonenumber);
	customer.getWallet().setBalance(customer.getWallet().getBalance().add(amount))
			return customer;
	}

	@Override
	public Customer Withdraw(String phoneNumber, BigDecimal amount) throws InsufficientBalanceException
	{
		Customer customer=walletrepo.findByPhoneNumber(phonenumber);
		if(customer.getWallet().getBalance.compareTo(BigDecimal.ZERO)<50)throw new InsufficientBalanceException();
		customer.getWallet().setBalance(customer.getWallet().getBalance().subtract(amount))
		return customer;
	}

	@Override
	public Customer fundTransfer(String sourcephonenumber, String targetphonenumber, BigDecimal amount)
			throws InsufficientBalanceException, PhoneNumberDoesNotExistException {
		Customer c1=walletrepo.findByPhoneNumber(sourcephonenumber);
		Customer c2=walletrepo.findByPhoneNumber(targetphonenumber);
		withdraw(sourcephonenumber,amount);
		deposit(targetphonenumber,amount);
	return c2;
	}

	@Override
	public boolean validate(Customer c) throws PhoneNumberDoesNotExistException 
	{

		if(!(c.getPhoneNumber().matches("[7-9][0-9]{9}")));
		throw new PhoneNumberDoesNotExistException();
	}

}
