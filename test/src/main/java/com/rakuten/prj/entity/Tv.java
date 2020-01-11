/**
 * 
 */
package com.rakuten.prj.entity;

/**
 * @author banup
 *
 */
public class Tv extends Product {
	private String screenType;

	/**
	 * 
	 */
	public Tv() {
	}

	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param screenType
	 */
	public Tv(int id, String name, double price, String screenType) {
		super(id, name, price);
		this.screenType = screenType;
	}

	/**
	 * @return the screenType
	 */
	public String getScreenType() {
		return screenType;
	}

	/**
	 * @param screenType the screenType to set
	 */
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	
}
