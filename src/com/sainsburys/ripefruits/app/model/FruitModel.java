package com.sainsburys.ripefruits.app.model;

/**
 * The Class FruitModel.
 */
public class FruitModel extends ProductModel {


	/** The unit_price. */
	private double unit_price;
	
	/**
	 * Gets the unit_price.
	 *
	 * @return the unit_price
	 */
	public double getUnit_price() {
		return unit_price;
	}
	
	/**
	 * Sets the unit_price.
	 *
	 * @param unit_price the new unit_price
	 */
	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	/* (non-Javadoc)
	 * @see com.sainsburys.ripefruits.app.model.ProductModel#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(unit_price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see com.sainsburys.ripefruits.app.model.ProductModel#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FruitModel other = (FruitModel) obj;
		if (Double.doubleToLongBits(unit_price) != Double.doubleToLongBits(other.unit_price))
			return false;
		return true;
	}
	
}
