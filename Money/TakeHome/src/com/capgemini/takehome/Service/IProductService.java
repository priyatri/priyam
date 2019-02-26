package com.capgemini.takehome.Service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exceptions.ProductIdInvalidException;

public interface IProductService
{
	Product getProductDetails(int productCode)throws ProductIdInvalidException;
}
