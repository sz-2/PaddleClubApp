package org.ulpgc.is.model;

public class Member extends Customer{
	private int points;
	private Address address;
	public Member(int points, String name, String surname, NIF nif) {
		super(name, surname, nif);
		this.points = points;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public void setAddress(String street, int number,int postalCode, String city) {
		this.address = new Address(street, number, postalCode, city);
	}
}
