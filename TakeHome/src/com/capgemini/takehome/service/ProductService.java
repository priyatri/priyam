package com.capgemini.takehome.service;

import com.capgemini.takehome.Exception.ProductIdInvalidException;
import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.dao.IProductDAO;

public class ProductService implements IProductService
{
	IProductDAO dao;
	

	public ProductService(IProductDAO dao) 
	{
		this.dao = dao;
	}


	@Override
	public Product getProductDetails(int productcode) throws ProductIdInvalidException {
		return dao.getProductDetails(productcode);
	}

}
