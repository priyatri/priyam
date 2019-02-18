package com.capgemini.service;

import com.capgemini.beans.Product;
import com.capgemini.exceptions.ProductIdInvalidException;
public interface IService
{

public Product getProductDetails(int prodCode) throws ProductIdInvalidException;
}

