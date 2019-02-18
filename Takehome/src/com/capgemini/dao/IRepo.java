package com.capgemini.dao;

import com.capgemini.beans.Product;
import com.capgemini.exceptions.ProductIdInvalidException;

public interface IRepo 
{
public Product getProductDetails(int prodCode) throws ProductIdInvalidException;
}
