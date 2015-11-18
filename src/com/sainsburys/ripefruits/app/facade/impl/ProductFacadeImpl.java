package com.sainsburys.ripefruits.app.facade.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sainsburys.ripefruits.app.dao.ProductDAO;
import com.sainsburys.ripefruits.app.dto.FruitData;
import com.sainsburys.ripefruits.app.dto.Result;
import com.sainsburys.ripefruits.app.facade.ProductFacade;
import com.sainsburys.ripefruits.app.model.FruitModel;
import com.sainsburys.ripefruits.app.populator.Populator;

/**
 * The Class ProductFacadeImpl.
 */
@Component("productFacade")
public class ProductFacadeImpl implements ProductFacade {

	/** The product dao. */
	@Resource
	private ProductDAO productDAO;
	@Resource
	private Result result;
	
	/** The fruit populator. */
	@Resource
	private Populator<FruitModel,FruitData> fruitPopulator;
	
	/* (non-Javadoc)
	 * @see com.sainsburys.ripefruits.app.facade.ProductFacade#getAllProductForThePage()
	 */
	@Override
	public Result getAllProductForThePage() {
		
		double total = 0;
		 List<FruitModel> allProducts = productDAO.getAllProductForThePage();
		 
		 List<FruitData> allProductsData = new ArrayList<FruitData>();
		 
		 for(FruitModel model : allProducts){
			 FruitData fruitData = new FruitData();
			 fruitPopulator.populate(model, fruitData);
			 total = total+fruitData.getUnit_price();
			 allProductsData.add(fruitData);
		 }
		 result.setResults(allProductsData);
		 result.setTotal(total);
		 return result;
	}

}
