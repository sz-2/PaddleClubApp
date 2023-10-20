package org.ulpgc.is.model;

public class Umpire extends Extra{
	private String name;
	private String surname;
	private int price;

	public Umpire(String name, String surname, int price) {
		this.name = name;
		this.surname = surname;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String getName() {
		return this.name + this.surname;
	}
}
