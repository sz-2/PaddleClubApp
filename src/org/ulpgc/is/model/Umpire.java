package org.ulpgc.is.model;

public class Umpire extends Extra{
	private String name;
	private String surname;

	public Umpire(String name, String surname) {
		this.name = name;
		this.surname = surname;
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
