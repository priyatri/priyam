package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.takehome.Exception.ProductIdInvalidException;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class Client
{
public static void main(String[]args)throws ProductIdInvalidException
{
	IProductDAO dao=new ProductDAO();
	IProductService service=new ProductService(dao);
	Scanner sc=new Scanner(System.in);
	int choice=0;
	int productcode = 0;
	while(true)
	{
	System.out.println("enter the productcode");
	int code=sc.nextInt();
	sc.nextLine();
	boolean b=true;
	while(b)
	{
		if(code<=999||code>=10000)
		{
			System.out.println("enter valid code");
			code=sc.nextInt();
			sc.nextLine();
		}
		else
		{
			b=false;
		}
	}
	System.out.println("enter the quantity");
	int qty=sc.nextInt();
	sc.nextLine();
	boolean a=true;
	while(a)
	{
		if(qty<=0)
		{
			System.out.println("enter valid quantity");
			 qty=sc.nextInt();
				sc.nextLine();
		}
		else
		{
			a=false;
		}
	}
	System.out.println("Enter choice");
	choice=sc.nextInt();
	System.out.println("Enter 1 to generate bill by entering productcode and quantity ");
	System.out.println("Enter 2 to exit");
	switch(choice)
	{
	case 1:
		try
	{
		int price;
	price = service.getProductDetails(productcode).getProductprice();
	int total=price*qty;
	System.out.println("Line Total: "+total);
	}
		catch(ProductIdInvalidException e)
		{
			System.out.println("Sorry! The Product code<<product_code>>is not available");
		}
	   break;
	case 2:
		System.exit(0);
		break;
		default :System.out.println("wrong choice");
	}

	
	}
		
	}
}
