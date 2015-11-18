package com.sainsburys.ripefruits.app.populator.impl;

import org.springframework.stereotype.Component;

import com.sainsburys.ripefruits.app.dto.FruitData;
import com.sainsburys.ripefruits.app.dto.ProductData;
import com.sainsburys.ripefruits.app.model.FruitModel;
import com.sainsburys.ripefruits.app.model.ProductModel;
import com.sainsburys.ripefruits.app.populator.Populator;

import junit.framework.Assert;

/**
 * The Class FruitPopulator.
 */
@Component("fruitPopulator")
public class FruitPopulator extends ProductPopulator implements Populator<ProductModel, ProductData> {

	/* (non-Javadoc)
	 * @see com.sainsburys.ripefruits.app.populator.impl.ProductPopulator#populate(com.sainsburys.ripefruits.app.model.ProductModel, com.sainsburys.ripefruits.app.dto.ProductData)
	 */
	@Override
	public void populate(ProductModel source, ProductData target) {
		Assert.assertNotNull("ProductModel  source class must not be null",source);
		Assert.assertNotNull("ProductData  target class must not be null",source);
		
		super.populate(source, target);
		if(source instanceof FruitModel && target instanceof FruitData){
			double price = ((FruitModel) source).getUnit_price();
			((FruitData)target).setUnit_price(price);
		}
		
	}

}
