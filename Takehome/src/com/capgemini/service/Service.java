package com.capgemini.service;

import com.capgemini.beans.Product;
import com.capgemini.dao.IRepo;
import com.capgemini.exceptions.ProductIdInvalidException;

public class Service implements IService
{
	IRepo repo;
	

	public Service(IRepo repo) {
		
		this.repo = repo;
	}


	@Override
	public Product getProductDetails(int prodCode) throws ProductIdInvalidException 
	{
	
		return repo.getProductDetails(prodCode);
	}

}
