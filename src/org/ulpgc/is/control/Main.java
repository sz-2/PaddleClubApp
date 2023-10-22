package org.ulpgc.is.control;

import org.ulpgc.is.model.*;

import java.time.LocalDate;

public class Main {

	public static void init(PaddleManager paddleManager) {
		paddleManager.addMember("Juan", "Travieso", new NIF("45329946B"), "Tomas Morales", 34, 35209, "Las Palmas", 100);
		paddleManager.addCustomer("Pedro", "Ruíz", new NIF("12SD34TT4"));
		paddleManager.addCourt("Alisios", 25, CourtType.FastCourt);
		paddleManager.addCourt("Siete Palmas", 20, CourtType.SlowCourt);
	}

	public static void main(String[] args) {

		PaddleManager paddleManager = new PaddleManager();

		init(paddleManager);

		// Imprimir por pantalla los NIF válidos de los clientes del club.
		for (Customer customer : paddleManager.getCustomer()) {
			if (!customer.getNif().getNumber().equals("XXXX")) {
				System.out.println(customer.getNif());
			}
		}

		// Imprimir por pantalla los datos del primer cliente.
		System.out.println(paddleManager.getCustomer().get(0));

		//Imprimir por pantalla los datos del segundo cliente.
		System.out.println(paddleManager.getCustomer().get(1));

		// Imprimir por pantalla los datos de la segunda pista.
		System.out.println(paddleManager.getCourt().get(1));

		// Crear una reserva por parte del primer cliente en la segunda pista.
		paddleManager.reserve(123564, LocalDate.now(), paddleManager.getCustomer().get(0), paddleManager.getCourt().get(1));

		// Crear una reserva por parte del primer cliente en la segunda pista.
		System.out.println(paddleManager.getReservation().get(0));

		//Borrar el segundo cliente.
		paddleManager.removeCustomer(1);

		// Imprimir por pantalla el número de clientes del club.
		System.out.println(paddleManager.getCountCustomer());

		/* Imprimir por pantalla de todas las reservas realizadas: el nombre del cliente
		que ha hecho la reserva, el nombre de la pista, el día y el coste de dicha reserva. */
		System.out.println(paddleManager.getReservation());
	}
}
