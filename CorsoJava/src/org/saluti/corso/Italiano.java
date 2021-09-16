package org.saluti.corso;

public class Italiano extends Saluto{

	
	@Override
	public String esegui() {
	
		return this.getModoSaluto() + this.getNazione();
	}
}