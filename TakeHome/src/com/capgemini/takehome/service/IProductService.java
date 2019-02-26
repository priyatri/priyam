package com.capgemini.takehome.service;

import com.capgemini.takehome.Exception.ProductIdInvalidException;
import com.capgemini.takehome.beans.Product;

public interface IProductService
{
Product getProductDetails(int productcode)throws ProductIdInvalidException;
}
