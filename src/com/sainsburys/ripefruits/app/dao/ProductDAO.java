package com.sainsburys.ripefruits.app.dao;

import java.util.List;

import com.sainsburys.ripefruits.app.model.FruitModel;

/**
 * The Interface ProductDAO.
 */
public interface ProductDAO {

	/**
	 * Gets the all product for the page.
	 *
	 * @return the all product for the page
	 */
	public List<FruitModel> getAllProductForThePage();
}
