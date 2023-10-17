package org.ulpgc.is.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reservation {

	private Customer customer;
	private Court court;
	private ArrayList<Extra> extra;
	private static int NEXT_ID = 0;
	private final int id;
	private LocalDateTime date;

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
		return this.court.getPrice();
	}

	public void extra(Extra extra){
		this.extra.add(extra);
	}

}
