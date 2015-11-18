package com.sainsburys.ripefruits.app.dto;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * The Class Result.
 */
@Component
public class Result {

	/** The results. */
	private List<FruitData> results;
	
	/** The total. */
	private double total; 

	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * Sets the total.
	 *
	 * @param total the new total
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * Gets the results.
	 *
	 * @return the results
	 */
	public List<FruitData> getResults() {
		return results;
	}

	/**
	 * Sets the results.
	 *
	 * @param results the new results
	 */
	public void setResults(List<FruitData> results) {
		this.results = results;
	}
}
