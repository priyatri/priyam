package com.capgemini.entry;
	
	

import java.math.BigDecimal;

import com.capgemini.Repo.WalletRepoImpl;
import com.capgemini.Service.WalletService;
import com.capgemini.Service.WalletServiceImpl;
import com.capgemini.exceptions.DuplicatePhoneNumberException;
import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.PhoneNumberDoesNotExistException;


public class Main
{
	
	public static void main(String[] args) throws DuplicatePhoneNumberException,PhoneNumberDoesNotExistException,InsufficientBalanceException
	
	{
WalletService walletservice= new WalletServiceImpl( new WalletRepoImpl());
// createAccount
System.out.println(walletservice.createAccount("priyam","123", new BigDecimal("4000")));
System.out.println(walletservice.createAccount("shubham","1234",new BigDecimal("5000")));
//showBalance
System.out.println(walletservice.showBalance("123"));
System.out.println(walletservice.showBalance("1234"));
//fundTransfer
System.out.println(walletservice.fundTransfer("123","1234", new BigDecimal("6000")));
//depositAmount
System.out.println(walletservice.Deposit("123", new BigDecimal("8000")));
System.out.println(walletservice.Deposit("1234", new BigDecimal("9000")));
//withdrawAmount
System.out.println(walletservice.Withdraw("123", new BigDecimal("100")));

}
}
	
