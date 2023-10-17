package org.ulpgc.is.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PaddleManager {

	private ArrayList<Customer> customerList;
	private ArrayList<Court> courtList;

	public PaddleManager(){
		this.customerList = new ArrayList<Customer>();
		this.courtList = new ArrayList<Court>();
	}

	public void addCustomer(String name, String surname, NIF nif){
		customerList.add(new Customer(name, surname, nif));
	}

	public Customer getCustomer(int index){
		return customerList.get(index);
	}

	public void addCourt(String name, int price, CourtType type){
		courtList.add(new Court(name, price, type));
	}

	public Court getCourt(int index){
		return courtList.get(index);
	}

	public void reserve(int id, LocalDateTime date,
						String nameCustomer, String surname, NIF nif,
						String nameCourt, int price, CourtType type){

		Customer customer = new Customer(nameCustomer, surname, nif);
		Court court = new Court(nameCourt, price, type);

		if(customerList.contains(customer)){

		}

	}
}
