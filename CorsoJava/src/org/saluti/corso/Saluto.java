package org.saluti.corso;

public  abstract class Saluto {


	public String esegui () {
		
		return getModoSaluto();
	};

	private String nazione;
	private String modoSaluto;
	
	public String saluta(String nazione, String modoSaluto) {
		this.nazione = nazione;
		this.modoSaluto = modoSaluto;
		String risultato = this.esegui();
		return risultato;
	

	
	
	}
	
	













	public String getNazione() {
		return nazione;
	}
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	public String getModoSaluto() {
		return modoSaluto;
	}
	public void setModoSaluto(String modoSaluto) {
		this.modoSaluto = modoSaluto;
	}
	
	
	
	
	
	}
	
	
	
	
	



		


	

