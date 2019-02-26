package com.capgemini.takehome.dao;

import com.capgemini.takehome.Exception.ProductIdInvalidException;
import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO
{
CollectionUtil util;
Product product;
	@Override
	public Product getProductDetails(int productcode) throws ProductIdInvalidException
	{
		product=CollectionUtil.getProducts().get(productcode);
		if(product==null)
		{
			throw new ProductIdInvalidException();
		}
		return product;
	}

}
