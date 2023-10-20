package org.ulpgc.is.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PaddleManager {

	private ArrayList<Customer> customerList;
	private ArrayList<Court> courtList;
	private ArrayList<Reservation> reservationsList;

	private int countCustomer = 0;

	public PaddleManager(){
		this.customerList = new ArrayList<Customer>();
		this.courtList = new ArrayList<Court>();
		this.reservationsList = new ArrayList<Reservation>();
	}

	public void addCustomer(String name, String surname, NIF nif){
		Customer customer = new Customer(name, surname, nif);
		if (!customerList.contains(customer)) {
			customerList.add(customer);
			countCustomer++;
		}else{
			System.out.println("This customer is already registered.");
		}
	}

	public void addMember(String name, String surname, NIF nif, String street,
						  int number,int postalCode, String city, int points){
		Member member = new Member(name, surname, nif, street, number, postalCode, city, points);
		if (!customerList.contains(member)) {
			customerList.add(member);
		}else{
			System.out.println("This customer is already registered.");
		}
	}

	public void removeCustomer(int index){
		customerList.remove(1);
	}

	public List<Customer> getCustomer(){
		return customerList;
	}

	public void addCourt(String name, int price, CourtType type){
		courtList.add(new Court(name, price, type));
	}

	public List<Court> getCourt(){
		return courtList;
	}

	public void reserve(int id, LocalDate date, Customer customer, Court court){
		reservationsList.add(new Reservation(id, date, customer, court));
	}

	public List<Reservation> getReservation(){
		return reservationsList;
	}

	public int getCountCustomer(){return countCustomer;}
}
