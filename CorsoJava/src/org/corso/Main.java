package org.corso;
public class Main {

	public static void main(String[] args) {
		
		Animali gatto= new Gatto();
		Animali cane= new Cane();
	
	
		gatto.setNome("micio");
		gatto.setColore("nero");
		gatto.setTipo("siamese");
		gatto.setCodice("INDSRKL");
		
	
		cane.setNome("fido");
		cane.setColore("marrone");
		cane.setTipo("pastore tedesco");
		cane.setCodice("rtyengkaymfundrk");
		
	System.out.println(gatto.getNome() + "  "+ gatto.getColore() + "  " + gatto.getTipo() + "   "  + gatto.getSuono());
	System.out.println(cane.getNome() + "  "+ cane.getColore() + "  " + cane.getTipo() + "   "  + cane.getSuono());

	
	if(gatto.controllaCodice()) {
		
		
		System.out.println("codice valido");
		
		
		
	} else {
		
		System.out.println("codice non valido");
	}
	
	
	if(cane.controllaCodice()) {
		
		
		System.out.println("codice valido");
		
		
		
	} else {
		
		System.out.println("codice non valido");
	}
	
	
	}

}
