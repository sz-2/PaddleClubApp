package org.ulpgc.is.model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NIF {
	private String number;

	public NIF(String number) {
		 if (isValid(number)){
			 this.number = number;
		 }else{
			 this.number = "XXXX";
		 }
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		if (isValid(number)){
			this.number = number;
		}else{
			this.number = "XXXX";
		}
	}

	public boolean isValid(String nif){
		// Comprobar si el NIF tiene el formato correcto
		Pattern pattern = Pattern.compile("^[0-9]{8}[A-Z]$");
		Matcher matcher = pattern.matcher(nif.trim().toUpperCase());

		return matcher.matches();
	}

	@Override
	public String toString() {
		return  number;
	}
}
