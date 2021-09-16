package org.saluti.corso;

public class Francesce extends Saluto{

	@Override
	public String esegui() {
	
		return this.getModoSaluto() + this.getNazione();
	}
}


