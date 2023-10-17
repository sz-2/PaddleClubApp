package org.ulpgc.is.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reservation {

	private Customer customer;
	private Court court;
	private static int NEXT_ID = 0;
	private final int id;
	private LocalDateTime date;
	private int extraTotal = 0;

	public Reservation(int id, LocalDateTime date, Customer customer, Court court) {
		NEXT_ID++;
		this.id = id;
		this.date = date;
		this.customer = customer;
		this.court = court;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public int price(){
		return this.court.getPrice() + this.extraTotal;
	}

	public void addExtra(Extra extra){
		this.extraTotal += extra.getPrice();
	}

}
