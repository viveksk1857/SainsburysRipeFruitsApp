package com.sainsburys.ripefruits.app.populator;
/**
 * The Interface Populator.
 *
 * @param <SOURCE> the generic type
 * @param <TARGET> the generic type
 */
public interface Populator<SOURCE,TARGET> {
	
	/**
	 * Populate.
	 *
	 * @param source the source
	 * @param target the target
	 */
	public void populate(SOURCE source,TARGET target);
}
