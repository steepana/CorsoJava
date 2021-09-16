package esercizio2.org;

public class Moltiplicazione  extends operazione{

	@Override
	public int esegui() {
		
		return this.getOperando1() * this.getOperando2();
	}

}
