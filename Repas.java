package awajaba.awa.fr;

import java.time.LocalDate;

public class Repas {

	private int numero ;
	private LocalDate date ;
	
	public Repas(int numero, LocalDate date) {
		super();
		this.numero = numero;
		this.date = date;
	}
		
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
test
