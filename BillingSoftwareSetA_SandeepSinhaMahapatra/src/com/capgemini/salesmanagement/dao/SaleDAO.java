package com.capgemini.salesmanagement.dao;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.InvalidSaleIdException;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class SaleDAO implements ISaleDAO {

	@Override
	public HashMap<Integer, Sale> insertSaleDetails(Sale sale) throws InvalidSaleIdException {
		if(CollectionUtil.getCollection().containsKey(sale.getSaleId())) 
			throw new InvalidSaleIdException("ERROR : DUPLICATE SALE ID WAS INSERTED. APPLICATION ABORT. PLEASE TRY AGAIN");
		else {
			CollectionUtil.getCollection().put(sale.getSaleId(), sale);
			return CollectionUtil.getCollection();
		}
		
	}
	
	

}
