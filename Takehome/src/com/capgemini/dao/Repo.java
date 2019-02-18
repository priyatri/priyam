package com.capgemini.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.beans.Product;
import com.capgemini.exceptions.ProductIdInvalidException;
import com.capgemini.util.CollectionUtil;

public class Repo implements IRepo
{
	CollectionUtil  util;
	Product product;
   Map<Integer,Product >hmap= new HashMap<Integer,Product>();
	@Override
	public Product getProductDetails(int prodCode) throws ProductIdInvalidException 
	{
		product= CollectionUtil.getProducts().get(prodCode);
		if(product==null)
   throw new ProductIdInvalidException();
		return product;
	}

}
