package com.capgemini.Repo;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.beans.Customer;

public class WalletRepoImpl implements WalletRepo 
{
	Map<String,Customer>map=new HashMap<>();

	@Override
	public boolean Save(Customer c) {
		if(map.containsKey(c.getPhoneNumber()))
			return false;
	map.put(c.getPhoneNumber(),c);
		
		return true;
	}

	@Override
	public Customer findByPhoneNumber(String phonenumber)
	{
		for(map.Entry<String,Customer>entry:map.entrySet())
			if(entry.getKey().equals(phonenumber))
				return entry.getValue();
		return null;
	}