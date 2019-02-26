package com.capgemini.takehome.dao;

import com.capgemini.takehome.Exception.ProductIdInvalidException;
import com.capgemini.takehome.beans.Product;

public interface IProductDAO
{
Product getProductDetails(int productcode) throws ProductIdInvalidException;

}
