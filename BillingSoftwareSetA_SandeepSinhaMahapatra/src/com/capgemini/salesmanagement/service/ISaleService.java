package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.InvalidSaleIdException;

public interface ISaleService {
	public HashMap<Integer, Sale> insertSaleDetails(Sale sale) throws InvalidSaleIdException;
	public boolean validateProductCode(int productId);
	boolean validateQuantity(int qty);
	public boolean validateProductCat(String prodCat);
	public boolean validateProductName(String prodName);
	public boolean validateProductPrice(float price);
	public float calculateLineTotal(float prodPrice, int prodQuan);
	public void getAllSaleDetails();
	
}
