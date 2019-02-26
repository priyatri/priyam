package com.capgemini.beans;

import java.math.BigDecimal;

public class Wallet
{
	int id;
	BigDecimal balance;
	public Wallet(int id, BigDecimal balance) 
	{
		this.id = id;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Wallet [id=" + id + ", balance=" + balance + "]";
	}
	
	

}
