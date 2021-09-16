package org.saluti.corso;

public class Inglese  extends Saluto{

	@Override
	public String esegui() {
	
		return this.getModoSaluto() + this.getNazione();
	}
}
