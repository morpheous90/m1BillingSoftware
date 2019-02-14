package com.capgemini.salesmanagement.dao;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.InvalidSaleIdException;

public interface ISaleDAO  {
	public HashMap<Integer, Sale> insertSaleDetails(Sale sale) throws InvalidSaleIdException;
	
}
