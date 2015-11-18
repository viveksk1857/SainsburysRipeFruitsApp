package com.sainsburys.ripefruits.app.populator.impl;

import com.sainsburys.ripefruits.app.dto.ProductData;
import com.sainsburys.ripefruits.app.model.ProductModel;
import com.sainsburys.ripefruits.app.populator.Populator;

import junit.framework.Assert;


/**
 * The Class ProductPopulator.
 */
public class ProductPopulator implements Populator<ProductModel, ProductData> {

	/* (non-Javadoc)
	 * @see com.sainsburys.ripefruits.app.populator.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(ProductModel source, ProductData target) {
		
		Assert.assertNotNull("ProductModel  source class must not be null",source);
		Assert.assertNotNull("ProductData  target class must not be null",source);
		
		
		target.setDescription(source.getDescription());
		target.setSize(source.getSize());
		target.setSku(source.getSku());
		target.setTitle(source.getTitle());
		
	}

}
