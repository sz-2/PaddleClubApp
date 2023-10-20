package org.ulpgc.is.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation {

	private Customer customer;
	private Court court;
	private static int NEXT_ID = 0;
	private final int id;
	private LocalDate date;
	private ArrayList<Extra> extrasList;
	private int totalExtras = 0;

	public Reservation(int id, LocalDate date, Customer customer, Court court) {
		NEXT_ID++;
		this.id = id;
		this.date = date;
		this.customer = customer;
		this.court = court;
	}

	public int getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int price(){
		return this.court.getPrice() + totalExtras;
	}

	public void extraUmpire(String name, String surname, int price){
		totalExtras += price;
		extrasList.add(new Umpire(name, surname, price));
	}

	public void extraEquipment(String name, int price){
		totalExtras += price;
		extrasList.add(new Equipment(name, price));
	}

	public ArrayList<Extra> getExtras(){
		return extrasList;
	}

	@Override
	public String toString() {
		return "Reservation" +
				"{ customer=" + customer.getName() + customer.getSurname() +
				", court=" + court.getType() +
				", date=" + date +
				", price=" + price() +
				'}';
	}
}
