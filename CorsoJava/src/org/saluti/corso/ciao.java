package org.saluti.corso;

public class ciao {

	public static void main(String[] args) {
		
		Saluto francese = new Francesce();
	  francese.setModoSaluto("bonjour");
	  francese.setNazione("Francia");
	  System.out.println(francese.getNazione() + " " + (francese.getModoSaluto()) );
	  
	  
	  Saluto inglese = new Inglese();
	  inglese.setModoSaluto("goodmorning");
	  inglese.setNazione("Inghilterra");
	  System.out.println(inglese.getNazione() + " " + (inglese.getModoSaluto()) );
	  
	  
	  Saluto italiano = new Italiano();
	  italiano.setModoSaluto("Ciao");
	  italiano.setNazione("Italia");
	  System.out.println(italiano.getNazione() + " " + (italiano.getModoSaluto()) );

	   


		

	}

}
