package org.ulpgc.is.model;

import java.util.ArrayList;
import java.util.Objects;

public class Customer {
	private String name;
	private String surname;
	private NIF nif;

	public Customer(String name, String surname, NIF nif){
		this.name = name;
		this.surname = surname;
		this.nif = nif;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public NIF getNif() {
		return nif;
	}

	public void setNif(NIF nif) {
		this.nif = nif;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Customer customer = (Customer) o;
		return Objects.equals(nif, customer.nif);
	}

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", nif=" + nif +
				'}';
	}
}
