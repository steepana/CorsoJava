package org.esercizio;

public class Main {

	public static void main(String[] args) {
		
		Persona daniel = new Persona ("nome:daniel","cognome:kadknfa");
		 Persona sara= new Persona("nome:sara","cognome:jsfhjsfhsj");
		 //System.out.println(daniel.getNome());
		 //System.out.println(daniel.getCognome());
		 //System.out.println(sara.getNome());
		 //System.out.println(sara.getCognome());
	
	//	daniel.setNome("daniel");
	//	daniel.setCognome("cherchi");
//		daniel.setCf("OULAJS1234");
		//daniel.NomeCognome();
		
	//	sara.setNome("sara");
	//	sara.setCognome("rossi");
	//	sara.setCf("12345kajdlal");
		//sara.NomeCognome();
		Macchina fiat2 = new Macchina(daniel);
		System.out.println(fiat2.getProprietario().getCognome()+ " " + (fiat2.getProprietario().getNome()));
		
		
		

		//System.out.println(daniel.NomeCognome());
		//System.out.println(sara.NomeCognome());
		
		
		
			
			
		
		if(daniel.Controllacf()) {
			
			
			System.out.println("le prime cifre sono lettere");
		} else {
			
			
			
			System.out.println("le prime cifre non sono lettere");
			
		}
		
		
		
		

		if(sara.Controllacf()) {
			
			
			System.out.println("le prime cifre sono lettere");
		} else {
			
			
			System.out.println("le prime cifre non sono lettere");
		}
		
		
		
			
			
		
		
	}
	

}
