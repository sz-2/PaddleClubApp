package org.ulpgc.is.model;

public class Equipment extends Extra{
	private String name;
	private int price;

	public Equipment(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return this.name;
	}
}
