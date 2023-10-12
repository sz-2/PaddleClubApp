package org.ulpgc.is.model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NIF {
	private String number;

	public NIF(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean isValid(String nif){

		// Eliminar espacios en blanco y convertir a mayúsculas.

		nif = nif.trim().toUpperCase();

		// Comprobar si el NIF tiene el formato correcto

		Pattern pattern = Pattern.compile("^[0-9]{8}[A-Z]$");
		Matcher matcher = pattern.matcher(nif);

		return matcher.matches();


	}
}
