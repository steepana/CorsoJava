package org.prova;

class biblioteca {

	public static void main(String[] args) {
		
		test libri= new test();
		libri.setLingua("italiano");
		libri.setAutori("Leopardi");
		libri.setTitoli("sabato del villaggio");
		

	
		libri.setAutori("Kant");
		libri.setLingua("tedesco");
		libri.setTitoli("schwarz");
	
		
		System.out.println(libri.TitoloCompleto());
		 
			
			
			
			
		
		
		
	
	}

}
