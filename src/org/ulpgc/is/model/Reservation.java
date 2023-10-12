package org.ulpgc.is.model;

import java.time.LocalDateTime;

public class Reservation {

	private static int NEXT_ID = 0;
	private final int id;
	private LocalDateTime date;

	public Reservation(int id, LocalDateTime date) {
		NEXT_ID++;
		this.id = id;
		this.date = date;
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

}
