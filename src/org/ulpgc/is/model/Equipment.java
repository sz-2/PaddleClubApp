package org.ulpgc.is.model;

public class Equipment extends Extra{
	private String name;

	public Equipment(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return this.name;
	}
}
