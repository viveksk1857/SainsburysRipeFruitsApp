package com.sainsburys.ripefruits.app.facade;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.util.ReflectionUtils;

import com.sainsburys.ripefruits.app.dao.ProductDAO;
import com.sainsburys.ripefruits.app.dao.impl.ProductDAOImpl;
import com.sainsburys.ripefruits.app.dto.FruitData;
import com.sainsburys.ripefruits.app.dto.ProductData;
import com.sainsburys.ripefruits.app.dto.Result;
import com.sainsburys.ripefruits.app.facade.impl.ProductFacadeImpl;
import com.sainsburys.ripefruits.app.model.FruitModel;
import com.sainsburys.ripefruits.app.model.ProductModel;
import com.sainsburys.ripefruits.app.populator.Populator;
import com.sainsburys.ripefruits.app.populator.impl.FruitPopulator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


/**
 * The Class ProductFacadeImplTest.
 */
public class ProductFacadeImplTest {
	

	/** The product dao. */
	@Mock
	private ProductDAOImpl productDAO;
	
	/** The result. */
	
	private Result result;
	
	/** The fruit populator. */
	
	private FruitPopulator fruitPopulator;
	
	/** The product facade impl. */
	private ProductFacadeImpl productFacadeImpl;
	
	/** The static data util. */
	private StaticDataUtil staticDataUtil;
	 
	
	/**
	 * Setup.
	 */
	@Before
	 public void setup(){
		 MockitoAnnotations.initMocks(this); 
		 productFacadeImpl = new ProductFacadeImpl();
		 result = new Result();
		 fruitPopulator = new FruitPopulator();
		 ReflectionTestUtils.setField(productFacadeImpl, "productDAO", productDAO);
		 ReflectionTestUtils.setField(productFacadeImpl, "result", result);
		 ReflectionTestUtils.setField(productFacadeImpl, "fruitPopulator", fruitPopulator);
		 
		// productFacadeImpl.
	 }
	
	/**
	 * Test get all product for the page.
	 */
	@Test
	public void testGetAllProductForThePage(){
		Mockito.when(productDAO.getAllProductForThePage()).thenReturn(staticDataUtil.getAllDummyProducts());
		Result result = productFacadeImpl.getAllProductForThePage();
		
		assertNotNull(result);
		assertNotNull(result.getResults());
		assertEquals(14, result.getResults().size());
		assertTrue(30.85 == result.getTotal());
		
	}

}
