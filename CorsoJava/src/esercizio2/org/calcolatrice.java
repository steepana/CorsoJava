package esercizio2.org;

public class calcolatrice {

	public static void main(String[] args) {
		operazione addizione = new Addizione();
        int risultato = addizione.calcola(10, 25);      
        System.out.println("La somma �: " + risultato);
        
    
    		operazione sottrazione = new Sottrazione();
             risultato = sottrazione.calcola(50, 25);      
            System.out.println("La sottrazione �: " + risultato);
            
            
            operazione moltiplicazione = new Moltiplicazione();
            risultato = moltiplicazione.calcola(50, 25);      
           System.out.println("La moltiplicazione �: " + risultato);

           operazione divisione = new Divisione();
           risultato = divisione.calcola(50, 25);      
          System.out.println("La divisione �: " + risultato);	

	}

}
