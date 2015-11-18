package com.sainsburys.ripefruits.app.dao.impl;

import org.junit.Before;
import org.mockito.Mock;
import java.util.ArrayList;
import java.util.List;
 
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.sainsburys.ripefruits.app.model.FruitModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;


public class ProductDAOImplTest {
	
	private ProductDAOImpl productDAOImpl;

	@Before
    public void setUp()
    {
		 productDAOImpl = new ProductDAOImpl();
		
    }
	 @Test
     public void testDAO()
     {
		 List<FruitModel> allProductForThePage = productDAOImpl.getAllProductForThePage();
		 assertNotNull(allProductForThePage);
		 assertEquals(14, allProductForThePage.size());
     }
}
