package org.ulpgc.is.model;

public class Court {
	private String name;

	private int price;
	private CourtType type;

	public Court(String name, int price, CourtType type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public CourtType getType() {
		return type;
	}

	public void setType(CourtType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Court{" +
				"name='" + name + '\'' +
				", price=" + price +
				", type=" + type +
				'}';
	}
}
