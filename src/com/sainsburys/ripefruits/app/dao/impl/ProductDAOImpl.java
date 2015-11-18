/**
 * 
 */
package com.sainsburys.ripefruits.app.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sainsburys.ripefruits.app.dao.ProductDAO;
import com.sainsburys.ripefruits.app.dao.StaticData;
import com.sainsburys.ripefruits.app.model.FruitModel;

/**
 * The Class ProductDAOImpl.
 *
 * @author khandav1
 */
@Component("productDAO")
public class ProductDAOImpl implements ProductDAO {

	/* (non-Javadoc)
	 * @see com.sainsburys.ripefruits.app.dao.ProductDAO#getAllProductForThePage()
	 */
	
	@Override
	public List<FruitModel> getAllProductForThePage() {
		return StaticData.getAllDummyProducts();
	}

}
