package com.capgemini.test;

import com.capgemini.dao.IRepo;
import com.capgemini.dao.Repo;
import com.capgemini.exceptions.ProductIdInvalidException;
import com.capgemini.service.IService;
import com.capgemini.service.Service;

import junit.framework.TestCase;

public class Tese
{
		IService ser;
		@Before
		public void setUp() throws Exception
		{
			ser=new Service(new Repo());
	}
@Test(expected = com.capgemini.exceptions.ProductIdInvalidException.class)
public void whenInvalidIdIsGivenSystemShouldThrowException() throws ProductIdInvalidException 
{
//	assertEquals(1001, serv.getProductDetails());
	ser.getProductDetails(2222);
}

@Test(expected = com.capgemini.exceptions.ProductIdInvalidException.class)
public void whenValidIdIsGivenSystemShouldNotThrowException() throws ProductIdInvalidException 
{
//	assertEquals(1001, serv.getProductDetails());
	ser.getProductDetails(1001);
}

}
