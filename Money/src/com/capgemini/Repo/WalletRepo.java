package com.capgemini.Repo;

import com.capgemini.beans.Customer;

public interface WalletRepo
{
	boolean Save(Customer c);
	Customer findByPhoneNumber(String phonenumber);

}

