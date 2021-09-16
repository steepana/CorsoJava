package org.esercizio;

public class Persona {
	
	private String nome;
	private String cognome;
	private String cf;
	
	
	//public String NomeCognome() {
		//return nome + " " +cognome;
	

 /**contruttore**/ public Persona (String nome, String cognome) {
	  this.nome= nome;
	  this.cognome=cognome;
	 
	  
  }



	public boolean Controllacf() {
		
		
		if (cf == null) {
			
			System.out.println("codice fiscale non impostato");
			
			return false;
		}
		
		if (cf.substring(0, 5).matches("[a-zA-Z]+")) {
			
			return true;
		} else
			
			return false;
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}

}
