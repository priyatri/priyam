package com.capgemini.beans;

public class Customer
{
String name;
String phone;
Wallet wallet;
public Customer(String name, String phonenumber, Wallet wallet) 
{

	this.name = name;
	this.phone = phonenumber;
	this.wallet = wallet;
}
public Customer()
{
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhoneNumber() {
	return phone;
}
public void setPhoneNumber(String phonenumber) {
	this.phone = phonenumber;
}
public Wallet getWallet() {
	return wallet;
}
public void setWallet(Wallet wallet) {
	this.wallet = wallet;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", phonenumber=" + phone + "]";
}



}