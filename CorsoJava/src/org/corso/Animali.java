package org.corso;

public class Animali {

	private String tipo;
	private String nome;
	private String colore;
	private String codice;
	private String suono;
	 
	public boolean controllaCodice() {  
		
		if (codice.length()==16) {
			
		return true;
		
		} else {
			
			return false;
	} 
	}
	
	

	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	

	
	public String getSuono(){
		

		
	return "Ogni animale emette un suono...";	
	}
	
	 
	
	

	}
	
	
	


