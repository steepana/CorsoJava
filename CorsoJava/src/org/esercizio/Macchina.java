package org.esercizio;



public class Macchina {
	
	private String modello;
	private long velocitÓ;
	private long velocitaMax;
	private Persona proprietario;
	
	
	
	public Macchina(Persona proprietario) {
		this.velocitaMax= 500;// 
		this.proprietario = proprietario;
		proprietario.setCognome("modificato!");//sto cambiando Persona proprietario non this.propretario
		
	}
		
	
	
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public long getVelocitÓ() {
		return velocitÓ;
	}
	public void setVelocitÓ(long velocitÓ) {
		this.velocitÓ = velocitÓ;
	}
	public long getVelocitaMax() {
		return velocitaMax;
	}
	public void setVelocitaMax(long velocitaMax) {
		this.velocitaMax = velocitaMax;
	}
	public Persona getProprietario() {
		return proprietario;
	}
	public void setProprietario(Persona proprietario) {
		this.proprietario = proprietario;
	}


}

