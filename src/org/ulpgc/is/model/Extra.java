package org.ulpgc.is.model;

public abstract class Extra {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract String getName();

}
