package com.capgemini.salesmanagement.test;

import java.time.LocalDate;
import java.util.HashMap;

import org.junit.*;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exceptions.InvalidSaleIdException;
import com.capgemini.salesmanagement.util.CollectionUtil;


public class SaleDAOServicesTest {
	private static SaleDAO daoServices;
	LocalDate localDate = LocalDate.now();
	
	@BeforeClass
	public static void setUpTestEnv() {
		daoServices = new SaleDAO();
	}
	
	@Before
	public void setUpTestData() {
		LocalDate localDate = LocalDate.now();
		Sale sale1 = new Sale(101, 1001,"Smart Phone" , "Electronics" , localDate , 2, 70000);
		Sale sale2 = new Sale(102, 1002,"TV" , "Electronics" , localDate , 4, 80000);
		CollectionUtil.getCollection().put(101, sale1);
		CollectionUtil.getCollection().put(102, sale2);
		
	}
	
	@Test
	public void testInsertSaleDetails() throws InvalidSaleIdException {
		LocalDate localDate = LocalDate.now();
		Sale expectedValue = new Sale(103, 1001,"Smart Phone" , "Electronics" , localDate , 2, 70000);
		HashMap<Integer, Sale> newMap= daoServices.insertSaleDetails(new Sale(103, 1001,"Smart Phone" , "Electronics" , localDate , 2, 70000));
		Sale actualValue = newMap.get(103);
		Assert.assertEquals(expectedValue, actualValue);
	}
	@After
	public void tearDownTestData() {
		CollectionUtil.getCollection().clear();
	}
	
	@AfterClass
	public static void tearDownTestEnv() {
		daoServices = null ;
	}
}
